<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>点金手联盟</title>
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
                

                <!-- Main content -->
                
                <section class="content">

                    <!-- Small boxes (Stat box) -->
                    <!-- /.row -->

                    <!-- Main row -->
                    <div class="row" style="vertical-align: middle;text-align: center;">
						<img alt="" src="${ctx}/img/index_bg.png">
                    </div><!-- /.row (main row) -->

                </section><!-- /.content -->
            </aside><!-- /.right-side -->
        </div><!-- ./wrapper -->

</body>
</html>