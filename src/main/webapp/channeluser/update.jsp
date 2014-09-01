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
				<h1>
					Dashboard <small>Control panel</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li class="active">Dashboard</li>
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
					<form role="form" action="${ctx}/channelUser/update.do">
					<input type="hidden" name="id" value="${channelUser.id}">
						<div class="box-body">
							<div class="form-group">
								<label for="qdLogin">渠道登录名</label> <input type="text"
									class="form-control" id="qdLogin" name="qdLogin"
									value="${channelUser.qdLogin} required >
							</div>
							<div class="form-group">
								<label for="qdName">渠道名称</label> <input type="text"
									class="form-control" id="qdName" name="qdName"
									value="${channelUser.qdName} required>
							</div>
							<div class="form-group">
								<label for="spreadPrice">推广单价</label> <input type="number"
									class="form-control" id="spreadPrice" name="spreadPrice"
									value="${channelUser.spreadPrice} required>
							</div>
							<div class="form-group">
								<label for="bankName">开户行</label> <input type="number"
									class="form-control" id="bankName" name="bankName"
									value="${channelUser.bankName} required>
							</div>
							<div class="form-group">
								<label for="bankAccount">银行账号</label> <input type="number"
									class="form-control" id="bankAccount" name="bankAccount"
									value="${channelUser.bankAccount} required>
							</div>
							<div class="form-group">
								<label for="bankUser">开户名</label> <input type="number"
									class="form-control" id="bankUser" name="bankUser"
									value="${channelUser.bankUser} required>
							</div>
						</div>
						<!-- /.box-body -->

						<div class="box-footer">
							<button type="submit" class="btn btn-primary">Submit</button>
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