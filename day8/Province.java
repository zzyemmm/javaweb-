package day8;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:身份实体类对象
 * 成员变量+方法
 * 省份:provinceName
 * 现存确诊:currentConfirmedCount
 * 累计确诊：confirmedCount
 * 累计治愈:curedCount
 * 累计死亡:deadCount
 */

public class Province {
    //成员变量
    private String provinceName;
    private int currentConfirmedCount;
    private int confirmedCount;
    private int curedCount;
    private int deadCount;

    //getter/setter方法
    public String getProvinceName() {
        return provinceName;
    }
    public int getCurrentConfirmedCount() {
        return currentConfirmedCount;
    }
    public int getConfirmedCount() {
        return confirmedCount;
    }
    public int getCuredCount() {
        return curedCount;
    }
    public int getDeadCount() {
        return deadCount;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public void setCurrentConfirmedCount(int currentConfirmedCount) {
        this.currentConfirmedCount = currentConfirmedCount;
    }
    public void setConfirmedCount(int confirmedCount) {
        this.confirmedCount = confirmedCount;
    }
    public void setCuredCount(int curedCount) {
        this.curedCount = curedCount;
    }
    public void setDeadCount(int deadCount) {
        this.deadCount = deadCount;
    }

    @Override
    public String toString(){
        return "疫情信息: [省份:" +provinceName +", 现存确诊:"+currentConfirmedCount
        +", 累计确诊:"+confirmedCount+", 累计治愈:"+curedCount+", 累计死亡:"+deadCount+"]";
    }

}
