package day7;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:2021-1-19
 * @description:
 */

public class ExceptionDemo2 {
    public static void main(String[] args) throws Exception{
        //抛出去的异常,谁调用谁处理
        System.out.println("游戏启动中...");
        int x=6;
        int y=x/0;
        System.out.println(y);
    }
}
