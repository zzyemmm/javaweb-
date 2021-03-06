package day8.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import day8.Citys;
import day8.Province;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import util.JDBC_Util;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class TestData {
    //爬取数据：Province对象   List<Province>

    //集合List
    List<Province> proList=new ArrayList<Province>();
    List<Citys> cityList =new ArrayList<Citys>();


    public List<Province> getInfo(){
        //1.要爬取的网站
        String url="https://ncov.dxy.cn/ncovh5/view/pneumonia";
        //2.爬取出整个页面
        Document doc=null;
        try {
            doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Safari/537.36")
                    .get();
            //System.out.println(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String res = doc.html();//转化为字符串
        //System.out.println(res);

        //3.做数据的筛选--正则表达式
        String regex="window.getAreaStat = (.*?)\\}(catch)";
        Pattern patt = Pattern.compile(regex);
        //System.out.println(patt);
        Matcher matcher=patt.matcher(res);
        // System.out.println(matcher);

        //集合List
        /*List<Province> proList=new ArrayList<Province>();
        List<Citys> cityList =new ArrayList<Citys>();*/

        String result="";
        if (matcher.find()){
            result=matcher.group(1);//第一个括号的内容
            //System.out.println(result);
            //数据解析--json
            //体积比较小
            ObjectMapper mapper=new ObjectMapper();

            try{
                JsonNode jn = mapper.readTree(result);
                //System.out.println(jn);

                for (int i=0;i<jn.size();i++){
                    //创建对象
                    Province pro=new Province();
                    String provinceName = jn.get(i).get("provinceName").asText();
                    int currentConfirmedCount = jn.get(i).get("currentConfirmedCount").asInt();
                    int confirmedCount = jn.get(i).get("confirmedCount").asInt();
                    int curedCount = jn.get(i).get("curedCount").asInt();
                    int deadCount = jn.get(i).get("deadCount").asInt();


                    System.out.println("省份:"+provinceName+", 现存确诊:"+currentConfirmedCount+", 累计确诊:"+confirmedCount+", 累计治愈:"+curedCount+", 累计死亡:"+deadCount);

                    pro.setProvinceName(provinceName);
                    pro.setConfirmedCount(confirmedCount);
                    pro.setCurrentConfirmedCount(currentConfirmedCount);
                    pro.setCuredCount(curedCount);
                    pro.setDeadCount(deadCount);

                    proList.add(pro);
                    //取二级数据
                    JsonNode jn1=jn.get(i).get("cities");
                    //System.out.println(jn1);
                    for (int j=0;j<jn1.size();j++){
                        //创建对象
                        Citys city=new Citys();
                        String cityName = jn1.get(j).get("cityName").asText();
                        int currentConfirmedCount2 = jn1.get(j).get("currentConfirmedCount").asInt();
                        int confirmedCount2 = jn1.get(j).get("confirmedCount").asInt();
                        int curedCount2 = jn1.get(j).get("curedCount").asInt();
                        int deadCount2 = jn1.get(j).get("deadCount").asInt();
                        System.out.println("地区:"+cityName+", 现存确诊:"+currentConfirmedCount2+", 累计确诊:"+confirmedCount2+", 累计治愈:"+curedCount2+", 累计死亡:"+deadCount2);

                        city.setCityName(cityName);
                        city.setConfirmedCount(confirmedCount);
                        city.setCurrentConfirmedCount(currentConfirmedCount);
                        city.setCuredCount(curedCount);
                        city.setDeadCount(deadCount);

                        cityList.add(city);
                    }
                    System.out.println("-------------------------------------------------------------");

                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return proList;
    }

    @Test
    public void testInsert() {
        //使用jdbc将爬取出来的数据放到数据库中
        Connection con=null;//连接对象
        PreparedStatement ps=null;//传输器对象
        ResultSet rs=null;//结果集对象
        //jdbc获取连接
        List<Province> proList = getInfo();
        try {
            con = JDBC_Util.getConn();
            //传输器对象
            String sql="insert into data values(?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            for (int i=0;i<proList.size();i++){
                Province pro = proList.get(i);
                ps.setString(1,pro.getProvinceName());
                ps.setInt(2,pro.getCurrentConfirmedCount());
                ps.setInt(3,pro.getConfirmedCount());
                ps.setInt(4,pro.getCuredCount());
                ps.setInt(5,pro.getDeadCount());
                int rows=ps.executeUpdate();
                System.out.println("rows"+rows);
            }

        }catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            JDBC_Util.DB_close(con,ps,rs);
        }


        //数据处理

        //结果集对象处理

        //释放资源
    }
}
