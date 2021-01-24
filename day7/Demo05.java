package day7;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class Demo05 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        //1.for循环实现迭代
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        //2.增强型for循环  String  addayList中的元素类型
        for (String str : arrayList){
            System.out.println(str+" ");
        }

        //3.迭代器
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){//如果仍有元素可以迭代,则返回true
            String str =(String) iterator.next();//返回迭代的下一个元素
            System.out.println(str);
        }

    }
}
