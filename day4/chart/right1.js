
var myChart = echarts.init(document.getElementById('right_1'),'light');//使用主题

// 指定图表的配置项和数据
var option = {
    title: {
        text: '全国确诊省市TOP5',
        textStyle: {
            color: 'red',
            fontSize: 18,
            fontWeight: 'bold',
        },
        link: 'https://voice.baidu.com/act/newpneumonia/newpneumonia'//链接
    },
    tooltip: {//提示框组件
        trigger:'axis',
        show: true,
        axisPointer:{
            type:'shadow',
        }
    },
    /*grid:{
        containLabel: true
    },*/
    legend: {
        data: ['确诊人数','本土新增'],
        top:'20px',
        textStyle:{
            color:'white',
            fontSize: 16
        },
    },
    toolbox: {
        feature:{
            magicType:{
                type:['bar','line']//动态图表的切换
            },
        }
    },
    xAxis: {
        type: 'category',
        data: ["河北", "黑龙江", "上海", "广东", "北京","福建","陕西"],
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
        splitLine:{
            lineStyle:{
                type:'dashed'
            }
        }
    },
    yAxis: {
        type:'value',
        // scale:true , //缩放脱离0值比例
        axisLabel:{//Y轴文字
            textStyle: {
                color:'white'
            }
        },
        axisLine:{//Y轴坐标
            lineStyle:{
                color:'white'
            }
        },
        splitLine:{
            lineStyle:{
                type:'dashed'
            }
        }
    },
    series: [{
        name: '确诊人数',
        type: 'bar',
        data: [120, 68, 93, 43, 39, 28,21],
        label: {
            show: true
        },
        markPoint: {//最大值最小值
            data: [
                {
                    type: 'max', name: '最大值'
                },{
                    type: 'min', name: '最小值'
                }
            ]
        },
        markLine: {//平均值
            data: [
                {
                    type: 'average',name: '平均值'
                }
            ],
            lineStyle:{
                color:'#00FFFF',
                type:'solid',
                width:'3'
            }
        },
        itemStyle: {
            color: {
                type: 'linear',//线性渐变
                x: 0, y: 0,
                x2: 0, y2: 1,
                colorStops: [
                    {
                        offset: 0, color: 'white'//0%处 颜色为红色
                    }, {
                        offset: 1, color: '#00FFFF' //100%处 颜色为绿色
                    }
                ]
            }
        }
    },
        {
            name:'本土新增',
            type:'bar',
            data: [77,110,80,90,40,30,50],
            label:{
                show: true,
                color:'white'
            },
            itemStyle: {
                color: {
                    type: 'linear',//线性渐变
                    x: 0, y: 0,
                    x2: 0, y2: 1,
                    colorStops: [
                        {
                            offset: 0, color: 'white'//0%处 颜色为红色
                        }, {
                            offset: 1, color: '#9900FF' //100%处 颜色为绿色
                        }
                    ]
                }
            },
            markPoint: {//最大值最小值
                data: [
                    {
                        type: 'max', name: '最大值'
                    },{
                        type: 'min', name: '最小值'
                    }
                ]
            },
            markLine: {//平均值
                data: [
                    {
                        type: 'average',name: '平均值'
                    }
                ],
                lineStyle:{
                    color:'#9900FF',
                    type:'solid',
                    width:'3'
                }
            },
        }
    ]
}

myChart.setOption(option);
