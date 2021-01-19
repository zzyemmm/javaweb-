package day6;
import java.sql.SQLOutput;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */
//定义一个方法，向一个整型数组中添加元素
/*
 * */
public class Demo03 {
    public static void main(String[] args) {
        Demo03 obj = new Demo03();
        int[] src={1,2,3,4};
        int[] dest=obj.addElement(src,5,6,7);
        for (int i=0;i<dest.length;i++){
            System.out.print(dest[i]+" ");
        }
    }

    //addElement
    /*动态参数方法:必须是方法中的最后一个参数，方法中以数组的形式处理动态参数
     * @param src:原数组
     * @param elements:元素
     * @return
     * 原数组：1,2,3----src
     * 追加的元素：4,5,6,7----elements
     * 返回的新数组：1,2,3,4,5,6,7----dest
     * */
    public int[] addElement(int[] src,int ...elements){
        int[] dest = new int[src.length+elements.length];
        //数组的复制
        System.arraycopy(src,0,dest,0,src.length);
        System.arraycopy(elements,0,dest,src.length,elements.length);
        return dest;
    }
}
