<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>demo</title>
<%@ include file="/common/jslibs.jsp"%>
<script
	src="${ctx}/js/plugins/jqBootstrapValidation/jqBootstrapValidation.js"></script>
<script type="text/javascript">
	$(function() {
		$("input,select,textarea").not("[type=submit]").jqBootstrapValidation();
	});
</script>
</head>

<body class="skin-blue">
	<!-- header logo: style can be found in header.less -->
	<%@ include file="/inc/top.jsp"%>
	<div class="wrapper row-offcanvas row-offcanvas-left">
		<!-- Left side column. contains the logo and sidebar -->
		<%@ include file="/inc/left.jsp"%>

		<!-- Right side column. Contains the navbar and content of the page -->
		<aside class="right-side">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>修改密码</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li class="active">修改密码</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">
				<div class="box box-primary">
					<div class="box-header">
						<h3 class="box-title">Quick Example</h3>
					</div>
					<!-- /.box-header -->
					<!-- form start -->
					<form role="form" action="${ctx}/user/pwdupdate.do">
						<div class="box-body">
							<div class="form-group">
								<div class="control-group">
									<label for="qdLogin">原密码</label>
									<div class="controls">
										<p class="help-block"></p>
										<input type="password" class="form-control" id="oldPwd"
											name="oldPwd" placeholder="请输入原密码"
											data-validation-ajax-ajax="${ctx}/user/validator/pwd.do">
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="control-group">
									<label for="qdName">新密码</label>
									<div class="controls">
										<p class="help-block"></p>
										<input type="password" class="form-control" id="newPwd"
											name="newPwd" placeholder="请输入新密码" required>
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="control-group">
									<label for="bankName">确认新密码</label>
									<div class="controls">
										<p class="help-block"></p>
										<input type="password" class="form-control" id="confirmPwd"
											name="confirmPwd" data-validation-match-match="newPwd"
											placeholder="请再次输入新密码" required>
									</div>
								</div>
							</div>
						</div>
						<!-- /.box-body -->

						<div class="box-footer">
							<button type="submit" class="btn btn-primary">提交</button>
						</div>
					</form>
				</div>
			</section>
			<!-- /.content -->
		</aside>
		<!-- /.right-side -->
	</div>
	<!-- ./wrapper -->

</body>
</html>