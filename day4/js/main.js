function getTime() {
    var time = new Date();
    var arr=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
    var hour=time.getHours();
    var min=time.getMinutes();
    var sec=time.getSeconds();
    var madetime = time.getFullYear()+"-"+(time.getMonth()+1)+"-"+time.getDate()+" "+arr[time.getDay()]+"  "+hour+(min<10?":0":":")+min+(sec<10?":0":":")+sec+(hour<12?" am":" pm");
    //document也是对象:代表整个HTML文档，可以用来访问页面中的所有的元素。
    document.getElementById("nowtime").innerHTML = madetime;
    //简单实用 后期会学习jQuery封装 Vue封装
}
    getTime();
    setInterval("getTime()",1000);//实现动态显示

    /*setInterval(code,millisec)
　　 参数：
　　 code    （必需）：要调用的函数后要执行的 JavaScript 代码串
　　 millisec（必需）：在执行代码前需等待的毫秒数*/

//在整个HTML文档加载完毕后会立即触发
/*window.onload = function () {
    getTime();
    setInterval("getTime()",1000);
}*/



