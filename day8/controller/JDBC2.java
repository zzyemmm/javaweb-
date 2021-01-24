package day8.controller;

import java.sql.*;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

class TestJDBC2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.实现数据库的驱动
        Connection con=null;//连接对象
        Statement stat=null;//传输器对象
        ResultSet rs=null;//结果集对象
        try {


            Class.forName("com.mysql.cj.jdbc.Driver");//8.0以上版本
            //Class.forName("com.mysql.jdbc.Driver");

            //2.获取数据库连接
            String url="jdbc:mysql://localhost/db_data?serverTimezone=CTT&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true";//
            String user="root";//数据库的用户名
            String password="zzy0720*";//数据库的密码
            con=DriverManager.getConnection(url,user,password);
            System.out.println(con);


            //3.获取传输对象
            stat = con.createStatement();

            //发送SQL
            String sql="select * from data";
            //4.返回执行的结果
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
            if (rs!=null){
                try {
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }finally {
                    rs=null;
                }
            }

            if (stat!=null){
                try {
                    stat.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }finally {
                    stat=null;
                }
            }

            if (con!=null){
                try {
                    con.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }finally {
                    con=null;
                }
            }
        }
    }
}
