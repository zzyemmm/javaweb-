package day7;

import java.util.ArrayList;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description: ArrayList用法:添加、删除、修改元素
 */

/*集合API
* Collection(接口)
*   |
*   List(子接口)
*       |
*       ArrayList(实现类)
*   Set(子接口)
*     |
*     HashSet(实现类)
* */
public class Demo04 {
    public static void main(String[] args) {
        //创建对象
        ArrayList<String> arrayList = new ArrayList<>();

        //添加元素
        arrayList.add("小马");
        arrayList.add("华子");
        arrayList.add("美紫");

        System.out.println(arrayList);//[小马, 华子, 美紫]
        arrayList.add(2,"老刘");//[小马, 华子, 老刘, 美紫]
        System.out.println(arrayList);

        arrayList.remove(0);//删除指定位置的元素
        System.out.println(arrayList);//[华子, 老刘, 美紫]

        arrayList.set(2,"马牛皮");//[华子, 老刘, 马牛皮]
        System.out.println(arrayList);

    }
}
