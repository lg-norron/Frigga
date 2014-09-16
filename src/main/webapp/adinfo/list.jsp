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
												"url" : "${ctx}/adinfo/list.do",
											},
											"columns" : [ {
												"data" : "id"
											}, {
												"data" : "adName"
											}, {
												"data" : "advertiser"
											}, {
												"data" : "adType"
											}, {
												"data" : "unitPrice"
											}, {
												"data" : "shelvesTime"
											}, {
												"data" : "offShelvesTime"
											} ],
											"columnDefs" : [ {
												"targets" : [ 7 ], // 目标列位置，下标从0开始
												"data" : "id", // 数据列名
												"render" : function(data, type,
														full) {
													// 返回自定义内容
													var edit = "<a href='${ctx}/adinfo/updateUI.do?id="+ data + "'>"+"<button class='btn btn-warning'>编辑</button>"+"</a>&nbsp;";
													var del = " <a href='${ctx}/adinfo/delete.do?id="+ data+ "'>"+"<button class='btn btn-danger'>删除</button>"+"</a>&nbsp;";
													var shelves = " <a href='${ctx}/adinfo/shelves.do?id="+ data+ "'>"+"<button class='btn btn-primary'>上架</button>"+"</a>&nbsp;";
													var offShelves = " <a href='${ctx}/adinfo/offShelves.do?id="+ data+ "'>"+"<button class='btn btn-default'>下架</button>"+"</a>&nbsp;";
													var str = edit + del + shelves + offShelves ;
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
					广告主信息 <small>列表</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li class="active">广告主信息</li>
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
									<a href="${ctx}/adinfo/add.jsp"><button
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
											<th>广告名</th>
											<th>广告商</th>
											<th>广告类型</th>
											<th>广告单价</th>
											<th>上架时间</th>
											<th>下架时间</th>
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