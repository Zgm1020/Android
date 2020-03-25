package com.jd.myapplication.orderList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jd.myapplication.R;

public class OrderListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public OrderListAdapter(Context mContext) {
        this.mContext = mContext;
        this.mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return 10;
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
        holder.mTv_1.setText("1");
        holder.mTv_2.setText("asdggasdf");
        holder.mTv_3.setText("sdvsdva");
        holder.mTv_4.setText("asdbas");
        holder.mTv_5.setText("asbv");
        return convertView;
    }
}
