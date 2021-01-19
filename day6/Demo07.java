package day6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class Demo07 {
        public static void main(String[] args) throws ParseException {

            Date date=new Date();
            System.out.println(date);//Mon Jan 18 17:11:24 CST 2021标准时间格式
            //1970 1.1号 0时0分0秒到现在的毫秒数
            System.out.println(date.getTime());//1610961140773 毫秒数

            //将字符串转换为java.util.Date
            String dateStr="2021-01-18";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date2 = sdf.parse(dateStr);
            System.out.println(date2);

            //将日期类型转为特定格式的字符串
            SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr2 = sdf2.format(date);
            System.out.println(dateStr2);
   }
}
