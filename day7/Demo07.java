package day7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class Demo07 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //map中添加元素
        map.put("H","华子");
        map.put("D","蛋蛋");
        map.put("z","紫旋");
        System.out.println(map);

        //获取元素
        String str = map.get("z");
        System.out.println(str);

        //迭代map元素
        Set<String> set=map.keySet();//获取到所有的key值
        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()){//true 或 false
            String key = (String) iterator.next();
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
    }
}
