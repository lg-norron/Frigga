<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>left</title>
</head>

<body>
	<aside class="left-side sidebar-offcanvas">
		<!-- sidebar: style can be found in sidebar.less -->
		<section class="sidebar">
			<!-- Sidebar user panel -->
			<ul class="sidebar-menu">
			<div class="user-panel">
				<div class="pull-left image">
					<img src="${ctx}/img/avatar3.png" class="img-circle" alt="User Image" />
				</div>
				<div class="pull-left info">
					<p>Hello, Jane</p>

					<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
				</div>
			</div>
				<li><a href="${ctx}/adinfo/list.jsp"> <i
						class="fa fa-table"></i> <span>广告主信息</span>
				</a></li>
				<li><a href="${ctx}/channeluser/list.jsp"> <i
						class="fa fa-table"></i> <span>渠道信息</span>
				</a></li>
				<li><a href="${ctx}/adspread/list.jsp"> <i
						class="fa fa-table"></i> <span>推广包信息</span>
				</a></li>
				
			</ul>
		</section>
		<!-- /.sidebar -->
	</aside>
</body>
</html>