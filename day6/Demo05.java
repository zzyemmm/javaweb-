package day6;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class Demo05 {
    public static void main(String[] args) {
        //匹配至少5位字母
        /*String str="abcDe";
        String regex ="^[a-zA-z]{5,}$";
        System.out.println(str.matches(regex));*///boolean--true 匹配

        //一组通配符 * ? +
        //一位1-9的数字和一位a-z的组合，组合可以出现任意此数
        /*String str="5a8b9q8q";
        String regex="^([1-9][a-z])*$";//*零次或多次
        System.out.println(str.matches(regex));*////boolean--true 匹配

        //? 一次或一次也没有
        String str="9A";
        String regex="^([1-9][a-zA-Z])?$";//?一次或一次也没有
        System.out.println(str.matches(regex));

        //+一次或多次
        String str2="8A9c7P";
        String regex2="^([1-9][a-zA-Z])+$";//+一次或多次
        System.out.println(str2.matches(regex2));
    }
}
