<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
    <%@ include file="../../static/head.jsp" %>
    <script src="${pageContext.request.contextPath}/resources/js/echarts.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/macarons.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/laydate.js"></script>
</head>

<style>
    .graph {
        margin: 10px auto;
    }
</style>
<body>
<!-- Pre Loader -->
<div class="loading">
    <div class="spinner">
        <div class="double-bounce1"></div>
        <div class="double-bounce2"></div>
    </div>
</div>
<!--/Pre Loader -->
<div class="wrapper">
    <!-- Page Content -->
    <div id="content">
        <!-- Top Navigation -->
        <%@ include file="../../static/topNav.jsp" %>
        <!-- Menu -->
        <div class="container menu-nav">
            <nav class="navbar navbar-expand-lg lochana-bg text-white">
                <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="ti-menu text-white"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto" id="navUl">

                    </ul>
                </div>
            </nav>
        </div>
        <!-- /Menu -->
        <!-- Breadcrumb -->
        <!-- Page Title -->
        <div class="container mt-0">
            <div class="row breadcrumb-bar">
                <div class="col-md-6">
                    <h3 class="block-title">成绩排名</h3>
                </div>
                <div class="col-md-6">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item">
                            <a href="${pageContext.request.contextPath}/index.jsp">
                                <span class="ti-home"></span>
                            </a>
                        </li>
                        <li class="breadcrumb-item">成绩排名管理</li>
                        <li class="breadcrumb-item active">成绩排名</li>
                    </ol>
                </div>
            </div>
        </div>

        <!-- /Breadcrumb -->
        <!-- Main Content -->
        <div class="container">
            <!-- Main Content -->
            <div class="row">
                <div class="col-md-12">
                    <div class="widget-area-2 lochana-box-shadow min-h200">
                        <h3 class="widget-title"></h3>
                        <!--
                        Your Content goes Here
                        -->
                        <div class="col-sm-12">
                            <div class="layui-inline" style="margin-bottom: 10px;">
                                月
                                <div class="layui-input-inline">
                                    <input type="text" id="insertTime" style="width: 100px;" class="form-control form-control-sm"
                                           placeholder="月" aria-controls="tableId">
                                </div>
                            </div>
                            <div class="layui-inline" style="margin-left: 30px;margin-bottom: 10px;">
                                <button onclick="getDetails()" type="button" class="btn btn-primary">查询</button>
                            </div>
                        </div>
                        <div id="main" style="width: 900px;height:600px;"></div>
                    </div>
                </div>
            </div>
        </div>
        <!-- /Main Content -->
        <!--Copy Rights-->
        <div class="container">
            <div class="d-sm-flex justify-content-center">

            </div>
        </div>
        <!-- /Copy Rights-->
    </div>
    <!-- /Page Content -->
</div>
<!-- Back to Top -->
<a id="back-to-top" href="#" class="back-to-top">
    <span class="ti-angle-up"></span>
</a>
<!-- /Back to Top -->
<%@ include file="../../static/foot.jsp" %>

<script>
    <%@ include file="../../utils/menu.jsp"%>
    <%@ include file="../../static/setMenu.js"%>
    <%@ include file="../../utils/baseUrl.jsp"%>
    var tableName = "dangyuan";
    var pageType = "graph";

    var valueArr = []


    $(document).ready(function () {

        //设置右上角用户名
        $('.dropdown-menu h5').html(window.sessionStorage.getItem('username'))
        //设置项目名
        $('.sidebar-header h3 a').html(projectName)
        setMenu();
        laydate.render({
            elem: '#insertTime'
            ,type: 'month'
        });
        //差報表數據
        getDetails();
        //draw();
        <%@ include file="../../static/myInfo.js"%>
    });


    function draw(list,val) {
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'), 'macarons');

        //柱状图 求和 已成功使用
        //start
        let yAxisName = "成绩";//根据查询数据具体改(单列要改,多列不改)
        let xAxisName = "月份";
        let series = [];//具体数据值
        list.yAxis.forEach(function (item,index) {
            let tempMap = {};
            tempMap.name= ["成绩"];//根据查询数据具体改(单列要改,多列不改)
            tempMap.type='bar';
            tempMap.data=item;
            series.push(tempMap);

        })

        var option = {
            tooltip: {
                trigger: 'axis',
                axisPointer: {
                    type: 'cross',
                    crossStyle: {
                        color: '#999'
                    }
                }
            },
            toolbox: {
                feature: {
                    magicType: { show: true, type: ['line', 'bar'] },//切换图形展示方式
                    saveAsImage: { show: true }//保存
                }
            },
            legend: {
                data: list.legend//标题  可以点击导致某一列数据消失
            },
            xAxis: [
                {
                    type: 'category',
                    name: xAxisName,
                    data: list.xAxis,
                    axisPointer: {
                        type: 'shadow'
                    }
                }
            ],
            yAxis: [
                {
                    type: 'value',//不能改
                    name: yAxisName,//y轴单位
                    axisLabel: {
                        formatter: '{value}' // 后缀
                    }
                }
            ],
            series:series//具体数据
        };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option,true);
    }

    // 需要调group的字段，一个字段一个统计图
    function getDetails() {
        var val = $("#insertTime").val();
        http("/barCount", "POST", {
            dateFormat :"%Y-%m", //%Y-%m
            riqi :val,
            thisTable : "{" +
            "                tableName :'xueshengchengji'," +
            "                types : 'xueshengchengji_types'" +
            "            }",
            joinTable : "{" +
            "                tableName :'yonghu'," +
            "                string : 'yonghu_name'," +
            "            }"
        }, (res) => {
            if(res.code == 0){
                if(res.data.length ==0){
                    alert(val+"没有数据");
                }
                draw(res.data,val);
            }
        });
    }

    // 用户登出
    <%@ include file="../../static/logout.jsp"%>
</script>
</body>

</html>