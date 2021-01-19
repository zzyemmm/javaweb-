package day6;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class Demo02 {
    public static int sumInt(int a,int b){
        return a+b;
    }
    public static double sumDouble(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int sum = sumInt(3,5);
        System.out.println("两数之和为"+sum);

        double sum2 = sumDouble(3,5);
        System.out.println("两数之和为"+sum2);
    }
}