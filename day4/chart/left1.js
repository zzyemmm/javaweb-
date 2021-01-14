var myChart = echarts.init(document.getElementById('left_1'));//使用主题

// 指定图表的配置项和数据
option = {
    title: {
        text: '全国疫情新增趋势',
        textStyle: {
            color: 'red',
            fontSize: 18,
            fontWeight: 'bold',
        },
        link: 'https://voice.baidu.com/act/newpneumonia/newpneumonia'//链接
    },
    tooltip:{
        trigger:'axis',
        axisPointer:{
            type:'line'
        }
    },
    legend: {
        data: ['现有确诊','现有疑似','累计治愈','累计死亡'],
        top:'20px',
        textStyle:{
            color:'white',
            fontSize: 16
        },
    },
    xAxis: {
        type: 'category',
        data: ['1月', '2月', '3月', '4月', '5月', '6月'],
        axisLabel:{
            textStyle: {
                color:'white'
            }
        },
        axisLine:{
            lineStyle:{
                color:'white'
            }
        },
    },
    yAxis: {
        type: 'value',
        axisLabel:{
            show:true,
            textStyle: {
                color:'white'
            },
            formatter:function (value) {
                if(value>=1000) {
                    value=value/1000 + 'k';
                }
                return value;
            }
        },
        axisLine:{
            lineStyle:{
                color:'white'
            }
        },
    },
    series: [{
        name:'现有确诊',
        data: [8200, 9000, 1000, 1200, 7200, 10000],
        type: 'line',
    },{
        name:'现有疑似',
        data: [7200, 4000, 5000, 2084, 6084, 11030],
        type: 'line',
    },{
        name:'累计治愈',
        data: [6000, 8000, 8600,6000, 11021, 13000],
        type: 'line',
    },{
        name:'累计死亡',
        data: [3000, 9000,2000, 4000, 3003, 1001],
        type: 'line',
    },
    ]
};

// 使用刚指定的配置项和数据显示图表。
myChart.setOption(option);