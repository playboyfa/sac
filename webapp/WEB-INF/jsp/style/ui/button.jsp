<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title></title>

<!--button-->
<link href="dist/css/style/ui/button.css" rel="stylesheet"
	type="text/css" />

<!--box-->
<link href="dist/css/style/ui/box.css" rel="stylesheet" type="text/css" />

<!--table-responsive.css-->
<link href="dist/css/style/layout/table-responsive.css" rel="stylesheet"
	type="text/css" />

<!--miscellaneous.css-->
<link href="dist/css/style/layout/miscellaneous.css" rel="stylesheet"
	type="text/css" />


<!--social-button.css-->
<link href="dist/css/style/ui/social-button.css" rel="stylesheet"
	type="text/css" />

</head>
<body>
	<div class="row" style="overflow:hidden">
	<div class="row">
		<div class="col-md-12">
			<div class="box box-primary">
				<div class="box-header">
					<div>
						<i class="fa fa-edit"></i>
						<h3 class="box-title">Buttons</h3>
					</div>
				</div>
				<div class="box-body pad table-responsive">
					<p>
						Various types of buttons. Using the base class
						<code>.btn</code>
					</p>
					<table class="table table-bordered text-center">
						<tr>
							<th>Normal</th>
							<th>Large <code>.btn-lg</code></th>
							<th>Small <code>.btn-sm</code></th>
							<th>X-Small <code>.btn-xs</code></th>
							<th>Flat <code>.btn-flat</code></th>
							<th>Disabled <code>.disabled</code></th>
						</tr>
						<tr>
							<td><button class="btn btn-block btn-default">Default</button></td>
							<td><button class="btn btn-block btn-black btn-lg">Default</button></td>
							<td><button class="btn btn-block btn-success btn-sm">Default</button></td>
							<td><button class="btn btn-block btn-info btn-xs">Default</button></td>
							<td><button class="btn btn-block btn-warning btn-flat">Default</button></td>
							<td><button class="btn btn-block btn-danger">Default</button></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-6">
			<!-- Block buttons -->
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">Block Buttons</h3>
				</div>
				<div class="box-body pad table-responsive">
					<button class="btn btn-default btn-block">.btn-block</button>
					<button class="btn btn-default btn-block btn-flat">.btn-block
						.btn-flat</button>
					<button class="btn btn-default btn-block btn-sm">.btn-block
						.btn-sm</button>
				</div>
			</div>
			<!-- /.box -->
			<!-- Horizontal grouping -->
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">Horizontal Button Group</h3>
				</div>
				<div class="box-body table-responsive pad">
					<p>
						Horizontal button groups are easy to create with bootstrap. Just
						add your buttons inside
						<code>&lt;div class="btn-group"&gt;&lt;/div&gt;</code>
					</p>

					<table class="table table-bordered">
						<tr>
							<th>Button</th>
							<th>Dropdown</th>
						</tr>
						<tr>
							<td>
								<div class="btn-group">
									<button type="button" class="btn btn-default">Left</button>
									<button type="button" class="btn btn-default">
										<i class="fa fa-align-center"></i>
									</button>
									<button type="button" class="btn btn-default">Right</button>
								</div>
							</td>
							<td>
								<div class="btn-group">
									<button type="button" class="btn btn-default">1</button>
									<button type="button" class="btn btn-default">2</button>

									<div class="btn-group">
										<button type="button" class="btn btn-default dropdown-toggle"
											data-toggle="dropdown">
											<span class="caret"></span>
										</button>
										<ul class="dropdown-menu">
											<li><a href="#">Dropdown link</a></li>
											<li><a href="#">Dropdown link</a></li>
										</ul>
									</div>
								</div>
							</td>
						</tr>
					</table>
				</div>
			</div>
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">Button Addon</h3>
				</div>
				<div class="box-body">
					<div class="input-group margin">
						<input type="text" class="form-control"> <span
							class="input-group-btn">
							<button class="btn btn-info btn-flat" type="button">Go!</button>
						</span>
					</div>
				</div>
			</div>

			<!-- social buttons -->
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">
						Social Buttons (By <a
							href="https://github.com/lipis/bootstrap-social">Lipis</a>)
					</h3>
				</div>
				<div class="box-body">
					<a class="btn btn-block btn-social btn-bitbucket"> <i
						class="fa fa-bitbucket"></i> <span>Sign in with Bitbucket</span>
					</a> </br>
					<div class="text-center">
						<a class="btn btn-social-icon btn-bitbucket"><i
							class="fa fa-bitbucket"></i></a>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-6">
			<!-- Application buttons -->
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">Application Buttons</h3>
				</div>
				<div class="box-body">
					<p>
						Add the classes
						<code>.btn.btn-app</code>
						to an
						<code>&lt;a></code>
						tag to achieve the following:
					</p>
					<a class="btn btn-app"> <i class="fa fa-edit"></i> Edit</a>
					<a class="btn btn-social-icon btn-bitbucket"> <i
						class="fa fa-bitbucket"></i>
					</a> 
				</div>
			</div>
			<!-- Various colors -->
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">Different colors</h3>
				</div>
				<div class="box-body">
					<p>
						Mix and match with various background colors. Use base class
						<code>.btn</code>
						and add any available
						<code>.bg-*</code>
						class
					</p>
					<!-- You may notice a .margin class added
                  here but that's only to make the content
                  display correctly without having to use a table-->
					<p>
						<button class="btn bg-maroon btn-flat margin">.btn.bg-maroon.btn-flat</button>
						<button class="btn bg-purple btn-flat margin">.btn.bg-purple.btn-flat</button>
						<button class="btn bg-navy btn-flat margin">.btn.bg-navy.btn-flat</button>
						<button class="btn bg-orange btn-flat margin">.btn.bg-orange.btn-flat</button>
						<button class="btn bg-olive btn-flat margin">.btn.bg-olive.btn-flat</button>
					</p>

					<p>
						<button class="btn bg-maroon margin">.btn.bg-maroon</button>
						<button class="btn bg-purple margin">.btn.bg-purple</button>
						<button class="btn bg-navy margin">.btn.bg-navy</button>
						<button class="btn bg-orange margin">.btn.bg-orange</button>
						<button class="btn bg-olive margin">.btn.bg-olive</button>
					</p>
				</div>
			</div>
			<!-- /.box -->
			<!-- Vertical grouping -->
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">Vertical Button Group</h3>
				</div>
				<div class="box-body table-responsive pad">

					<p>
						Vertical button groups are easy to create with bootstrap. Just add
						your buttons inside
						<code>&lt;div class="btn-group-vertical"&gt;&lt;/div&gt;</code>
					</p>

					<table class="table table-bordered">
						<tr>
							<th>Button</th>
						</tr>
						<!-- Default -->
						<tr>
							<td>
								<div class="btn-group-vertical">
									<button type="button" class="btn btn-default">Top</button>
									<button type="button" class="btn btn-default">Middle</button>
									<button type="button" class="btn btn-default">Bottom</button>
								</div>
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		</div>
</body>
</html>
