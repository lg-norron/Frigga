<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>demo</title>
<%@ include file="/common/jslibs.jsp" %>
</head>

<body class="skin-blue">
        <!-- header logo: style can be found in header.less -->
        <%@ include file="/inc/top.jsp" %>
        <div class="wrapper row-offcanvas row-offcanvas-left">
            <!-- Left side column. contains the logo and sidebar -->
            <%@ include file="/inc/left.jsp" %>

            <!-- Right side column. Contains the navbar and content of the page -->
            <aside class="right-side">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Dashboard
                        <small>Control panel</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Dashboard</li>
                    </ol>
                </section>

                <!-- Main content -->
                <div class="chart" id="line-chart" style="height: 250px;"></div>
                <section class="content">

                    <!-- Small boxes (Stat box) -->
                    <!-- /.row -->

                    <!-- Main row -->
                    <div class="row">

                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->
            </aside><!-- /.right-side -->
        </div><!-- ./wrapper -->

</body>
</html>