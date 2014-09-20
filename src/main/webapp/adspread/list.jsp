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
												"url" : "${ctx}/adspread/list.do",
											},
											"columns" : [ {
												"data" : "id"
											}, {
												"data" : "adId"
											}, {
												"data" : "qdId"
											}, {
												"data" : "packageName"
											}, {
												"data" : "rebateProp"
											}, {
												"data" : "rebateSince"
											}, {
												"data" : "rebateSinceFlag"
											}, {
												"data" : "spreadPrice"
											}, {
												"data" : "downloadUrl"
											} ],
											"columnDefs" : [
													{
														"targets" : [ 9 ], // 目标列位置，下标从0开始
														"data" : "downloadUrl", // 数据列名
														"render" : function(
																data, type,
																full) {
															// 返回自定义内容
															var str = "";
															if(data.indexOf("http://")>-1){
																str = " <a href='"+ data+ "'>"
																+ "<button class='btn btn-primary'><i class='fa fa-download'></i>下载包</button>"
																+ "</a>&nbsp;";
															}else{
																str = " <a href='${ctx}/"+ data+ "'>"
																+ "<button class='btn btn-primary'><i class='fa fa-download'></i>下载包</button>"
																+ "</a>&nbsp;";
															}
															
															return str;
														}
													},
													{
														"targets" : [ 10 ], // 目标列位置，下标从0开始
														"data" : "id", // 数据列名
														"render" : function(
																data, type,
																full) {
															// 返回自定义内容
															var edit = "<a href='${ctx}/adspread/updateUI.do?id="
																	+ data
																	+ "'>"
																	+ "<button class='btn btn-warning'>编辑</button>"
																	+ "</a>&nbsp;";
															var del = " <a href='${ctx}/adspread/delete.do?id="
																	+ data
																	+ "'>"
																	+ "<button class='btn btn-danger'>删除</button>"
																	+ "</a>&nbsp;";
															var record = " <a href='${ctx}/adspreadday/recordUI.do?spreadId="
																	+ data
																	+ "'>"
																	+ "<button class='btn btn-danger'>录入数据</button>"
																	+ "</a>&nbsp;";
															var veiwlist = " <a href='${ctx}/adspreadday/list.jsp?spreadId="
																	+ data
																	+ "'>"
																	+ "<button class='btn btn-info'>查看推广列表</button>"
																	+ "</a>&nbsp;";

															var str = edit
																	+ del
																	+ veiwlist;
															return str;
														}
													}

											]
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
					推广包信息 <small>列表</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li class="active">推广包信息</li>
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
									<a href="${ctx}/adspread/addUI.do"><button
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
											<th>广告ID</th>
											<th>渠道ID</th>
											<th>包名</th>
											<th>折扣比例</th>
											<th>折扣起量</th>
											<th>起量参考标识</th>
											<th>推广单价</th>
											<th>下载地址</th>
											<th>操作</th>
											<th>下载</th>
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