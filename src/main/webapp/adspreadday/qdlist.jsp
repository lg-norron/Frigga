<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>demo</title>
<%@ include file="/common/jslibs.jsp"%>
<!-- page script -->
<script type="text/javascript">

$(document)
		.ready(
				function() {
					var table = $("#example2")
							.dataTable(
									{
										"processing" : true,
										"searching":false,
										"serverSide" : true,
										"ajax" : {
											"url" : "${ctx}/adspreadday/list.do?spreadId=${param.spreadId}&minSpreadDate=${param.minSpreadDate}&maxSpreadDate=${param.maxSpreadDate}",
										},
										"columns" : [ {
											"data" : "spreadDate"
										}, {
											"data" : "adId"
										}, {
											"data" : "qdId"
										}, {
											"data" : "packageName"
										}, {
											"data" : "activeExpenses"
										}]
									});

				});
function search(){
	var minSpreadDate = $("#minSpreadDate").val();
	var maxSpreadDate = $("#maxSpreadDate").val();
	location.href = "${ctx}/adspreadday/list.jsp?spreadId=${param.spreadId}&minSpreadDate="+minSpreadDate+"&maxSpreadDate="+maxSpreadDate;
}
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
					推广包日报表
					
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li class="active">推广包日报表</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">

				<!-- Small boxes (Stat box) -->
				<!-- /.row -->

				<!-- Main row -->
				<div class="row">
					<div class="col-xs-12">
						<div class="box">
							<div class="box-header">
								<div>
									<a
										href="${ctx}/adspreadday/recordUI.do?spreadId=${param.spreadId}"><button
											class="btn btn-success btn-lg"
											style="margin-top: 10px;margin-left: 10px">添加</button></a>
								</div>

							</div>
							<!-- /.box-header -->
							<div class="box-body table-responsive">
								<table border="0" cellspacing="5" cellpadding="5">
									<tbody>
										<tr>
											<td>推广日期:</td>
											<td><input type="text" id="minSpreadDate" name="minSpreadDate" value="${param.minSpreadDate}" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'maxSpreadDate\')||\'2020-10-01\'}'})"/> 至 <input type="text" id="maxSpreadDate" name="maxSpreadDate" value="${param.maxSpreadDate}" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'minSpreadDate\')}',maxDate:'2020-10-01'})"/></td>
											<td><button onclick="search()">查询</button></td>
										</tr>
									</tbody>
									<table id="example2" class="table table-bordered table-hover">
										<thead>
											<tr>
												<th>推广日期</th>
												<th>广告ID</th>
												<th>渠道ID</th>
												<th>包名</th>
												<th>激活量</th>
												
											</tr>
										</thead>
										<tbody></tbody>
									</table>
							</div>
							<!-- /.box-body -->
						</div>
						<!-- /.box -->
					</div>
				</div>
				<!-- /.row (main row) -->

			</section>
			<!-- /.content -->
		</aside>
		<!-- /.right-side -->
	</div>
	<!-- ./wrapper -->

</body>
</html>