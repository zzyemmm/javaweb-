package day6;

import java.util.Scanner;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

//用户输入一个整数，判断该整数的素数还是合数
/*public class day6_1 {
    public static void main(String[] args) {
        System.out.println("请输入整数n:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int flag= 0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                flag++;
            }
        }
        if (flag==2){
            System.out.println(n+"是质数.");
        }
        else if (flag==0||flag==1){
            System.out.println(n+"既不是质数也不是合数.");
        }
        else {
            System.out.println(n+"是合数.");
        }
    }
}*/

//需求2：定义一个方法,向一个整型数组中添加元素
//数组定义基本格式:
/*      int[] arr; Java写法
*       int arr[]; C语言写法
*
*       int[] arr=new int[3];动态初始化
*       int[] arr=new int[]{1,2,3};
*       int[] arr={1,2,3};
*
*       错误写法：
*       int[] arr;
*       arr={1,2,3};
*
*       正确写法:
*       int[] arr;
 *      arr=new int[]{1,2,3};
 *
 *      数组的长度:
 *          arr.length
 *      数组的复制:扩容、缩容
 *      数组的下表:
 *      数组的范围:
 *      数组的排序
 *
 * 方法:
 *      封装了一段特定业务逻辑的代码
 *
 *      方法格式:
 *      修饰符：返回值类型 方法名称(参数列表){
 *          方法体;
 *      }
 *      返回值类型+参数列表---实际的业务逻辑来确定
 *      参数列表:数据类型 变量名
 *      public int sum(int x,int y){
 *          return x+y;
 *      }
 *
 *      方法的调用:
 *      void:
 *          sum(3,5);---有参数无返回值
 *      int:
 *      int sum1 = sum(3,5)；有参数有返回值
* */

