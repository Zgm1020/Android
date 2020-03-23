package com.jd.myapplication;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import static com.jd.utils.getSQLConnection.getSQLConnection;
import static com.jd.utils.getSQLConnection.testSQL;
import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void test01(){
        String sql="select * from JD_MES_MD_MOM_ASN_DELIVERY_BILL";
        String result = testSQL(sql);
        System.out.println(result);

    }
    @Test
    public void test02(){
        try {
            Connection conn = getSQLConnection("172.16.150.136","sa","123456","JDSOFT_MOM_NEW_bakeup_LFformal20190918_MYZ");
            String sql="select * from JD_MES_MD_MOM_USER_INFO where USER_ID=1";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
//            while(rs.next()){
//                String array = rs.getString("USER_NAME");
//                System.out.println(array);
//            }
            ResultSetMetaData m = rs.getMetaData();
            int count = m.getColumnCount();
            for (int i = 1; i <=count ; i++) {
                System.out.print(m.getColumnName(i));
                System.out.print("\t\t");
            }
            System.out.println();
            while(rs.next())
            {
                for(int i=1;i<=14;i++)
                {
                    System.out.print(rs.getString(i));
                    System.out.print("\t\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test03(){
        for (int i = 9; i >=1 ; i--) {
            for (int j = 9; j >=i ; j--) {
                System.out.print(j+"*"+i+"="+(i*j));
                System.out.print("\t\t");
            }
            System.out.println();
        }

    }
}