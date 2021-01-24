package day7;

import java.sql.Timestamp;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:2021-1-19
 * @description:
 */

public class Demo02 {
    public static void main(String[] args) {
        //System.currentTimeMillis()
        Timestamp st=new Timestamp(System.currentTimeMillis());
        System.out.println(st);
        long time = st.getTime();
        System.out.println(time);
    }
}
