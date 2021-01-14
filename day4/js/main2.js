
$(function () {
    setInterval("getTime()", 1000);
});

function getTime() {
    var time = new Date();
    var year = time.getFullYear();
    var month = (time.getMonth()+1+'').padStart(2,'0');
    var day = time.getDate();
    var arr=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
    var hour=(time.getHours()+'').padStart(2,'0');
    var min=(time.getMinutes()+'').padStart(2,'0');
    var sec=(time.getSeconds()+'').padStart(2,'0');
    content = `${year}年${month}月${day}日 ${arr[time.getDay()]} ${hour}:${min}:${sec} ${(hour<12?" am":" pm")}`
    // var madetime = year+"年"+month+"月"+day+"日"+" "+arr[time.getDay()]+" "+hour+":"+min+":"+sec+(hour<12?" am":" pm");

    $('#nowtime').text(content);
}

/*setInterval(function() {
    var now = (new Date()).toLocaleString();
    $('#nowtime').text(now);
}, 1000);*/
