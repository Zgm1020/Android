package com.jd.myapplication.orderList;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jd.myapplication.R;
import com.jd.myapplication.domain.SqlServerOrderListJsonResult;
import com.jd.utils.retrofit.RetrofitCreator;
import com.jd.utils.retrofit.WebInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class OrderListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<SqlServerOrderListJsonResult.MessageBean> items = new ArrayList<>();

    public OrderListAdapter(Context mContext) {
        this.mContext = mContext;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    static class ViewHolder{
        public TextView mTv_1,mTv_2,mTv_3,mTv_4,mTv_5;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if (convertView==null){
            convertView=mLayoutInflater.inflate(R.layout.listview_item_order,null);
            holder=new ViewHolder();
            holder.mTv_1=convertView.findViewById(R.id.tv_1);
            holder.mTv_2=convertView.findViewById(R.id.tv_2);
            holder.mTv_3=convertView.findViewById(R.id.tv_3);
            holder.mTv_4=convertView.findViewById(R.id.tv_4);
            holder.mTv_5=convertView.findViewById(R.id.tv_5);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }

        requestParames();
        SqlServerOrderListJsonResult.MessageBean messageBean = items.get(position);
        holder.mTv_1.setText(position);
        holder.mTv_2.setText(messageBean.getMPO_CODE());
        holder.mTv_3.setText(messageBean.getMPOR_ORG_NAME());
        holder.mTv_4.setText(messageBean.getMPO_TYPE());
        holder.mTv_5.setText(messageBean.getMPOM_EXPECT_RECE_TIME());
        return convertView;
    }

    private void requestParames() {
        WebInterface webInterface = RetrofitCreator.getInstance().getRetrofit().create(WebInterface.class);
        Map<String,String> map=new HashMap<>();
        String supplyId = map.put("supply_id", "111");
        Call<SqlServerOrderListJsonResult> orderList = webInterface.getOrderList(map);
        orderList.enqueue(new Callback<SqlServerOrderListJsonResult>() {
            @Override
            public void onResponse(Call<SqlServerOrderListJsonResult> call, Response<SqlServerOrderListJsonResult> response) {
                List<SqlServerOrderListJsonResult.MessageBean> message = response.body().getMessage();
                items=message;
                Log.d(TAG, "onResponse: 请求成功");
            }

            @Override
            public void onFailure(Call<SqlServerOrderListJsonResult> call, Throwable t) {

            }
        });


    }
}
