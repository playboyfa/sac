<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>

<!--button.css-->
<link href="dist/css/style/ui/button.css" rel="stylesheet"
	type="text/css" />
<link href="dist/css/style/ui/modal-dialog.css" rel="stylesheet"
	type="text/css" />

<script src="plugins/jQueryUI/jquery-ui.min.js" type="text/javascript"></script>
<script src="plugins/jquery-ui-touch-punch-master/jquery.ui.touch-punch.min.js" type="text/javascript"></script>

<script>
	$(".modal-dialog").draggable();
	$("#dialog-btn").on("click", function(){
	    $('#modal-example').modal({
		  backdrop:false
		});
	});
</script>
</head>
<body>
	<div class="row">
		<div>
			<a id="dialog-btn" class="btn btn-block btn-default">Default</a>
		</div>
		<div id="modal-example" class="modal fade">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<i class="fa fa-desktop"></i> <span>提示框</span>
						<button type="button" class="btn close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<p>One fine body&hellip;</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="button" class="btn btn-default">确定</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
	</div>
</body>
</html>
