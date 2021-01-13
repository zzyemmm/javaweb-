
$(function () {
    setInterval("getTime()", 1000);
});

function getTime() {
    var time = new Date();
    var year = time.getFullYear();
    var month = time.getMonth()+1;
    var day = time.getDate();
    var arr=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
    var hour=time.getHours();
    var min=time.getMinutes();
    var sec=time.getSeconds();
    var madetime = year+"年"+month+"月"+day+"日"+" "+arr[time.getDay()]+"  "+hour+(min<10?":0":":")+min+(sec<10?":0":":")+sec+(hour<12?" am":" pm");

    $('#nowtime').html(madetime);
}

/*setInterval(function() {
    var now = (new Date()).toLocaleString();
    $('#nowtime').text(now);
}, 1000);*/
