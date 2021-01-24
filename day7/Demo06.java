package day7;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description: HashSet set集合存储元素和取出元素的顺序不同
 */

public class Demo06 {
    public static void main(String[] args) {
        //创建对象
        HashSet<String> set = new HashSet<>();

        set.add("aa");
        set.add("bb");
        set.add("cc");
        set.add("dd");
        set.add("dd");//不能添加重复的元素
        System.out.println(set);
        //没有指定位置的添加元素
        //迭代set中的元素，只能用迭代器
        for (Iterator<String> sti=set.iterator(); sti.hasNext();){
            String str =sti.next();
            System.out.println(str);
        }

        //实现list集合,set集合
    }
}
