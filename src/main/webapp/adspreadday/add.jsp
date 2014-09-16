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
					推广包日报表 <small>登记</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li class="active">登记推广包日报表</li>
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
					<form role="form" action="${ctx}/adspreadday/record.do" method="post" enctype="multipart/form-data">
						<input type="hidden" name="spreadId" value="${adSpread.id}">
						<input type="hidden" name="id" value="${id}">
						<div class="box-body">
							<div class="form-group">
								<label for="packageName">包名：</label><label>${adSpread.packageName}</label>
							</div>
							<div class="form-group">
								<label>广告ID：</label><label>${adSpread.adId}</label>
							</div>
							<div class="form-group">
								<label>渠道ID：</label><label>${adSpread.qdId}</label>
							</div>
							<div class="form-group">
								<label for="spreadDate">推广日期：
								<input type="text" name="spreadDate" id="spreadDate" value="${spreadDate}" readonly="readonly">
							</div>
							<div class="form-group">
								<label for="activeRevenue">收入激活量</label> <input type="number"
									class="form-control" id="activeRevenue" name="activeRevenue"
									value="${activeRevenue}" required>
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