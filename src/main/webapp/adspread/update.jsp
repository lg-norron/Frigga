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
									value="${adSpread.packageName}" required>
							</div>
							<div class="form-group">
								<label>广告ID</label> <select class="form-control" id="adId" name="adId">
									<c:forEach items="${adInfoList}" var="adInfo">
									<option value="${adInfo.id}" <c:if test="${adSpread.adId==adInfo.id}"> selected="selected"</c:if> >${adInfo.adName}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label>渠道ID</label> <select class="form-control" id="qdId" name="qdId">
									<c:forEach items="${channelUserList}" var="channelUser">
									<option value="${channelUser.id}" <c:if test="${adSpread.qdId==channelUser.id}"> selected="selected"</c:if> >${channelUser.qdName}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label for="rebateProp">折扣比例(X%)</label> <input type="number"
									class="form-control" id="rebateProp" name="rebateProp" value="${adSpread.rebateProp}"
									required>
							</div>
							<div class="form-group">
								<label for="rebateSince">折扣起量</label> <input type="number"
									class="form-control" id="rebateSince" name="rebateSince"
									value="${adSpread.rebateSince}" required>
							</div>
							<div class="form-group">
								<label for="spreadPrice">推广单价</label> <input type="number"
									class="form-control" id="spreadPrice" name="spreadPrice" step="0.01"
									value="${adSpread.spreadPrice} required>
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