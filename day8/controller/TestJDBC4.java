package day8.controller;

import java.sql.*;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class TestJDBC4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.实现数据库的驱动
        Connection con=null;//连接对象
        PreparedStatement ps=null;//传输器对象
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

            //发送SQL
            String sql="insert into data values(?,?,?,?,?)";
            //获取传输对象
            ps = con.prepareStatement(sql);

            ps.setString(1,"山西省");
            ps.setInt(2,6);
            ps.setInt(3,3);
            ps.setInt(4,1);
            ps.setInt(5,0);

            int rows=ps.executeUpdate();
            System.out.println("受影响的行:"+rows);
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

            if (ps!=null){
                try {
                    ps.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }finally {
                    ps=null;
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
