package training.exercise.day1;

import cn.tedu.qr.CreateQR;
import org.junit.Test;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:2021.1.11
 * @description:
 */


public class TestQRcode {
    //main方法
    public static void main(String[] args){
        System.out.println("生成二维码");
    }

    //单元测试方法  运行时只运行单元测试里面的
    @Test
    public void testQR(){
        System.out.println("单元测试方法");

        String url ="https://yz.chsi.com.cn/";
        String fileName = "F:\\实训\\项目\\yzw.png";

        CreateQR.create(200,200,url,fileName);
        System.out.println("创建二维码成功！");
    }
}
