<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>top</title>
</head>

<body>
	<header class="header">
		<a href="index.html" class="logo"> <!-- Add the class icon to your logo image or logo icon to add the margining -->
			渠道推广统计后台
		</a>
		<!-- Header Navbar: style can be found in header.less -->
		<nav class="navbar navbar-static-top" role="navigation">
			<!-- Sidebar toggle button-->
			<div class="navbar-right">
				<ul class="nav navbar-nav">
					<!-- Messages: style can be found in dropdown.less-->
				
					<!-- Notifications: style can be found in dropdown.less -->
					
					<!-- Tasks: style can be found in dropdown.less -->
					
					<!-- User Account: style can be found in dropdown.less -->
					<c:if test="${user.role != 'super' }">
					<li class=" user user-menu">
					<a href="${ctx}/user/updatePwd.jsp"><span>修改密码</span></a>
					</li>
					</c:if>
					<li class=" user user-menu">
					<a href="${ctx}/user/logout.do"> <span>登出</span></a>
					</li>
				</ul>
			</div>
		</nav>
	</header>
</body>
</html>