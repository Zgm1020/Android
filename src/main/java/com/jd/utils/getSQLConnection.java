package com.jd.utils;

import android.database.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class getSQLConnection {
    public static Connection getSQLConnection(String ip, String user, String pwd, String db)
    {
        Connection con = null;
        try
        {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            //int t=1;
            con = DriverManager.getConnection("jdbc:jtds:sqlserver://" + ip + ":1433/" + db + ";useunicode=true;characterEncoding=UTF-8", user, pwd);
            //加上 useunicode=true;characterEncoding=UTF-8 防止中文乱码
            //int j=0;
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static String testSQL(String sql)
    {
        String result = "字段1  -  字段2\n";
        try
        {
            Connection conn = getSQLConnection("172.16.150.136", "sa", "123456", "JDSOFT_MOM_NEW_bakeup_LFformal20190918_MYZ");//远程连接的端口一定要查看电脑的，而不是手机的
            //String sql = "select * from JD_MES_MD_MOM_ASN_DELIVERY_BILL";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);


            while (rs.next())
            {
                // <code>ResultSet</code
                String s1 = rs.getString("MDB_ID");
                String s2 = rs.getString("MSI_ID");
                result += s1 + "  -  " + s2 + "\n";
                //System.out.println(s1 + "  -  " + s2);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e)
        {
            e.printStackTrace();
            //result += "查询数据异常!" + e.getMessage();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return result;
        //return bool;
    }

}
