package util;

import javax.xml.transform.Result;
import java.sql.*;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class JDBC_Util {
    /*
    * 注册驱动获取连接*/
    public static Connection getConn() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取数据库连接
        String url="jdbc:mysql://localhost/db_data?serverTimezone=CTT&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true";//
        String user="root";//数据库的用户名
        String password="zzy0720*";//数据库的密码
        Connection conn= DriverManager.getConnection(url,user,password);
        return conn;
    }

    /*释放jdbc程序的资源*/
    public static void DB_close(Connection con, Statement stat, ResultSet rs){//关闭连接
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
