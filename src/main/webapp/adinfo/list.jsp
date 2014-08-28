<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html class="no-js">

<head>
<title>Admin Home Page</title>
<%@ include file="/common/jslibs.jsp"%>

</head>

<body>
	<div class="navbar navbar-fixed-top">
		<%@ include file="/inc/top.jsp"%>
	</div>
	<div class="container-fluid">
		<div class="row-fluid">
			<%@ include file="/inc/left.jsp"%>
			<!--/span-->
			<div class="span9" id="content">
				<div class="row-fluid">
					<!-- block -->
					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">Bootstrap dataTables with
								Toolbar</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								
								<table cellpadding="0" cellspacing="0" border="0"
									class="table table-striped table-bordered" id="example">
									<thead>
										<tr>
											<th>ID</th>
											<th>ADNAME</th>
											<th>ADTYPE</th>
											<th>ADVERTISER</th>
										</tr>
									</thead>
								</table>
							</div>
						</div>
					</div>
					<!-- /block -->
				</div>
			</div>
		</div>
		<hr>
		<%@ include file="/inc/bottom.jsp"%>
	</div>
	<!--/.fluid-container-->
	<script type="text/javascript">
		$(function() {
			$("#example").dataTable({
				"ajax":"${ctx}/adinfo/list.do",
				"columns":[
					{"list":"id"},
					{"list":"adName"},
					{"list":"adType"},
					{"list":"advertiser"}
				]
			});
		});
	</script> 
</body>

</html>