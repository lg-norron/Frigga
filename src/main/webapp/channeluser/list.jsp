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
						$("#example2")
								.dataTable(
										{
											"processing" : true,
											"serverSide" : true,
											"ajax" : {
												"url" : "${ctx}/channeluser/list.do",
											},
											"columns" : [ {
												"data" : "id"
											}, {
												"data" : "qdLogin"
											}, {
												"data" : "qdName"
											}, {
												"data" : "bankName"
											}, {
												"data" : "bankAccount"
											}, {
												"data" : "bankUser"
											} ],
											"columnDefs" : [ {
												"targets" : [ 6 ], // 目标列位置，下标从0开始
												"data" : "id", // 数据列名
												"render" : function(data, type,
														full) {
													// 返回自定义内容
													var edit = "<a href='${ctx}/channeluser/updateUI.do?id="+ data + "'>"+"<button class='btn btn-warning'>编辑</button>"+"</a>&nbsp;";
													var del = " <a href='${ctx}/channeluser/delete.do?id="+ data+ "'>"+"<button class='btn btn-danger'>删除</button>"+"</a>&nbsp;";
													var shelves = " <a href='${ctx}/channeluser/shelves.do?id="+ data+ "'>"+"<button class='btn btn-primary'>上架</button>"+"</a>&nbsp;";
													var offShelves = " <a href='${ctx}/channeluser/offShelves.do?id="+ data+ "'>"+"<button class='btn btn-default'>下架</button>"+"</a>&nbsp;";
													var str = edit + del  ;
													return str;
												}
											} ]
										});
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
					<li><a href="#">Examples</a></li>
					<li class="active">Blank page</li>
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
									<a href="${ctx}/channeluser/add.jsp"><button
											class="btn btn-success btn-lg"
											style="margin-top: 10px;margin-left: 10px">添加</button></a>
								</div>

							</div>
							<!-- /.box-header -->
							<div class="box-body table-responsive">
								<table id="example2" class="table table-bordered table-hover">
									<thead>
										<tr>
											<th>id</th>
											<th>渠道登录名</th>
											<th>渠道名称</th>
											<th>开户行</th>
											<th>银行账号</th>
											<th>开户名</th>
											<th>操作</th>
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