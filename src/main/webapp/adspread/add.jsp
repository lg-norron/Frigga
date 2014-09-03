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
					<form role="form" action="${ctx}/adspread/add.do" method="post" enctype="multipart/form-data">
						<div class="box-body">
							<div class="form-group">
								<label for="qdLogin">包名</label> <input type="text"
									class="form-control" id="packageName" name="packageName"
									placeholder="请输入包名" required>
							</div>
							<div class="form-group">
								<label>广告ID</label> <select class="form-control" id="adId" name="adId">
									<c:forEach items="${adInfoList}" var="adInfo">
									<option value="${adInfo.id}">${adInfo.adName}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label>渠道ID</label> <select class="form-control" id="qdId" name="qdId">
									<c:forEach items="${channelUserList}" var="channelUser">
									<option value="${channelUser.id}">${channelUser.qdName}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label for="bankName">折扣比例(X%)</label> <input type="number"
									class="form-control" id="rebateProp" name="rebateProp" value="80"
									required>
							</div>
							<div class="form-group">
								<label for="bankAccount">折扣起量</label> <input type="number"
									class="form-control" id="rebateSince" name="rebateSince"
									value="100" required>
							</div>
							<div class="form-group">
								<label for="exampleInputFile">File input</label> <input
									type="file" id="filename" name="filename">
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