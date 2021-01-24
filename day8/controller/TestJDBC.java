package day8.controller;

import java.sql.*;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class TestJDBC {
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

        //4.发送SQL
        String sql="insert into data values('北京',112,18,1,0)";
        int rows=stat.executeUpdate(sql);
        System.out.println("影响了"+rows+"行");
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
