package day6;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class Demo06 {
    public static void main(String[] args) {
        /*String email="zzy847464807@qq.com";
        String regex = "^\\w+@\\w+\\.\\w+$";
        boolean flag = email.matches(regex);
        if (flag){
            System.out.println("注册成功！");
        }else {
            System.out.println("邮箱格式错误！");
        }*/

        String ID = "14200020210101090X";
        String regex = "^\\d{17}(\\d|X)$";
        boolean flag = ID.matches(regex);
        if (flag){
            System.out.println("身份证合法!");
        }else {
            System.out.println("身份证不合法,请检查!");
        }
    }
}
