package day6;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */
//正则表达式
public class Demo04 {

    public static void main(String[] args){
        String str = "1239";//匹配任意四位数字

        //任意四位数
        String regex="[1234567890][1234567890][1234567890][1234567890]";
        System.out.println(str.matches(regex));//boolean--true 匹配

        regex="[0-9][0-9][0-9][0-9]";
        System.out.println(str.matches(regex));//boolean--true 匹配

        regex="[0-9]{4}";
        System.out.println(str.matches(regex));//boolean--true 匹配

        regex="\\d{4}";
        System.out.println(str.matches(regex));//boolean--true 匹配

        //8-16位数字
        str="1523456879";//只能匹配到8-16位数字
        regex="[0-9]{8,16}";//8位到16位
        System.out.println(str.matches(regex));//boolean--true 匹配

        regex="\\d{8,16}";
        System.out.println(str.matches(regex));//boolean--true 匹配

        //以^开头 $结尾
        regex="^\\d{8,16}$";
        System.out.println(str.matches(regex));//boolean--true 匹配

        //匹配abcde;;;; --非数字的正则 8-16位
        str="abcde;;;;";
        regex="^\\D{8,16}$";
        System.out.println(str.matches(regex));//boolean--true 匹配

    }
}
