package day7;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:爬取疫情数据
 */

public class Demo09 {
    @Test
    public void test01()  {
        //1.要爬取的网站
        String url="https://ncov.dxy.cn/ncovh5/view/pneumonia";
        //2.爬取出整个页面
        Document doc=null;
        try {
            doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36")
                    .get();
//            System.out.println(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String res = doc.html();//转化为字符串
//        System.out.println(res);

        //3.做数据的筛选--正则表达式
        String regex="window.getAreaStat = (.*?)\\}(catch)";
        Pattern patt = Pattern.compile(regex);
        //System.out.println(patt);
        Matcher matcher=patt.matcher(res);
        // System.out.println(matcher);

        String result="";
        if (matcher.find()){
            result=matcher.group(1);//第一个括号的内容
            System.out.println(result);
        }
        //数据解析--json

        //4.将数据进行打印
    }
}
