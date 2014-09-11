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
					<li class="active">编辑广告主信息</li>
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
					<form role="form" action="${ctx}/adinfo/update.do">
					<input type="hidden" name="id" value="${adInfo.id}">
						<div class="box-body">
							<div class="form-group">
								<label for="adName">广告名</label> <input type="text"
									class="form-control" id="adName" name="adName"
									value="${adInfo.adName}" required >
							</div>
							<div class="form-group">
								<label for="advertiser">广告商</label> <input type="text"
									class="form-control" id="advertiser" name="advertiser"
									value="${adInfo.advertiser}" required>
							</div>
							<div class="form-group">
								<label for="unitPrice">广告单价</label> <input type="number"
									class="form-control" id="unitPrice" name="unitPrice"
									value="${adInfo.unitPrice}" required>
							</div>
							<div class="form-group">
							<label for="unitPrice">广告类型${adInfo.adType}</label>
								<div class="radio">
									<label> <input type="radio" name="adType" id="APP"
										value="APP" style="margin-left: 0px" checked="checked"/>APP
									</label>
								</div>
								<div class="radio">
									<label> <input type="radio" name="adType" id="APK"
										value="APK"  style="margin-left: 0px" <c:if test="${adInfo.adType=='APK'}"> checked="checked"</c:if> />APK
									</label>
								</div>
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