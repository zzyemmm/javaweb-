package day7;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:2021.1.19
 * @description:
 */

public class ExceptionDemo1 {

    public static void main(String[] args) {
        //捕获异常处理:主动去处理
        try {
            int x=6;
            int y=x/0;

            System.out.println(y);
        }catch (ArithmeticException e){
            System.out.println("发生异常");
        }
        catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("启动中...");
            System.out.println("进入游戏...");
        }

        System.out.println("程序运行结束");


    }
}
