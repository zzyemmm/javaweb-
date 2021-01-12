function getTime() {
    var time = new Date();
    var arr=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
    var hour=time.getHours();
    var min=time.getMinutes();
    var sec=time.getSeconds();
    var madetime = time.getFullYear()+"-"+(time.getMonth()+1)+"-"+time.getDate()+" "+arr[time.getDay()]+"  "+hour+(min<10?":0":":")+min+(sec<10?":0":":")+sec+(hour<12?" am":" pm");
    document.getElementById("nowtime").innerText = madetime;
}
    getTime();
    setInterval("getTime()",1000);//实现动态显示

    /*setInterval(code,millisec)
　　 参数：
　　 code    （必需）：要调用的函数后要执行的 JavaScript 代码串
　　 millisec（必需）：在执行代码前需等待的毫秒数*/





