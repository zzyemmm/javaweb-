package day8;

/**
 * @author:zzy
 * @email:847464807@qq.com
 * @version:v1.1.0
 * @time:
 * @description:
 */

public class Citys {
    //成员变量
    private String cityName;
    private int currentConfirmedCount;
    private int confirmedCount;
    private int curedCount;
    private int deadCount;

    public String getCityName() {
        return cityName;
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

    public void setCityName(String cityName) {
        this.cityName = cityName;
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
        return "疫情信息: [地区:" +cityName +", 现存确诊:"+currentConfirmedCount
                +", 累计确诊:"+confirmedCount+", 累计治愈:"+curedCount+", 累计死亡:"+deadCount+"]";
    }
}
