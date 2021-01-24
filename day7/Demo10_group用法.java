package day7;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class Demo10_group用法 {
    public static void main(String[] args) {


        //Pattern:类 用于创建一个正则表达式的 创建一个匹配模式，构造方法是私有的
        /*不可直接去创建,可以通过Pattern.complie(String regex)工厂方法进行创建的一个正则表达式
        * */
        String str = "I love you World!";
        String regex="W(or)(ld)";
        Pattern patt= Pattern.compile(regex);
        Matcher matcher=patt.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group(0));//--得到整个串 World 得到的是第0组 就是整个串
            System.out.println(matcher.group(1));//--得到第一个括号中的内容 or 得到的是第1组，与or匹配的
            System.out.println(matcher.group(2));//--得到第二个括号中的内容
        }
    }
}
