package day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description: 描述:java.sql.Date
 */

public class Demo01 {
    public static void main(String[] args) throws ParseException {
        //将用户的数据以日期的形式添加到数据库中
        String dateStr = "2021-01-19";


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date1 = sdf.parse(dateStr);
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);
        //将数据库中的日期类型的数据,使用一些特殊的格式显示在页面中
        //2021年01月19日

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年-MM月-dd日");
        String str=sdf2.format(new Date());
        System.out.println(str);

        java.sql.Date date=new java.sql.Date(20*24*60*1000);
        Date date3=date;
        System.out.println(date3);
    }
}
