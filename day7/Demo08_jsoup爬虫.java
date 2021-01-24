package day7;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;


import java.io.IOException;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description: jsoup爬虫
 */

public class Demo08_jsoup爬虫 {

    @Test
    public void test01() throws IOException {
        String url="https://item.jd.com/100012920646.html";
        Document doc = Jsoup.connect(url).get();
//        System.out.println(doc);
        //获取到有效的数据---数据的筛选
        Element ele = doc.select(".itemInfo-wrap .sku-name").get(0);
        String title = ele.text();
        System.out.println(title);
    }

}
