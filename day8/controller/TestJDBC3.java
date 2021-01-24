package day8.controller;

import util.JDBC_Util;

import java.sql.*;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class TestJDBC3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //实现数据库的驱动
        Connection con=null;//连接对象
        Statement stat=null;//传输器对象
        ResultSet rs=null;//结果集对象
        try {
            con =JDBC_Util.getConn();
            //获取传输对象
            stat = con.createStatement();
            //发送SQL
            String sql="select * from data";
            rs=stat.executeQuery(sql);
            //5.处理结果
            while (rs.next()){
                String ProvinceName= rs.getString("ProvinceName");
                int currentConfirmedCount=rs.getInt("CurrentConfirmedCount");
                int confirmedCount=rs.getInt("confirmedCount");
                int curedCount=rs.getInt("curedCount");
                int deadCount=rs.getInt("deadCount");
                System.out.println("地区:"+ProvinceName+", 现存确诊:"+currentConfirmedCount+", 累计确诊:"+confirmedCount+", 累计治愈:"+curedCount+", 累计死亡:"+deadCount);
            }
            System.out.println(rs);
        }catch (Exception e){
            e.printStackTrace();
        }finally {//5.释放资源
            JDBC_Util.DB_close(con,stat,rs);
        }
    }
}
