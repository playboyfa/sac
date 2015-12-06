<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>custom-toolbar</title>
    <meta charset="utf-8">
    <link href="plugins/bootstrap-table-master/dist/bootstrap-table.min.css" rel="stylesheet">
    <style>
        .w70 {width: 70px !important;}
    </style>
    <script type="text/javascript" src="plugins/bootstrap-table-master/dist/bootstrap-table.min.js"></script>
</head>
<body>
    <div class="row">
        <h1>Custom Toolbar</h1>
        <p>Use <code>toolbar</code> option to define the custom toolbars.</p>
        
        <table id="table"
               data-toggle="table"
               data-height="460"
               data-show-refresh="true"
               data-show-toggle="true"
               data-show-columns="true"
               data-pagination="true"
               data-query-params="queryParams"
               data-response-handler="responseHandler">
            <thead>
            <tr>
                <th data-field="id">ID</th>
                <th data-field="name">Item Name</th>
                <th data-field="price">Item Price</th>
            </tr>
            </thead><tbody>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            	<tr>
            		<td>1</td>
            		</td>Item 1</td>
            		</td>$1</td>
            	</tr>
            </tbody>
        </table>
    </div>

<script>
    var $table = $('#table'),
        $ok = $('#ok');

    $(function () {
        $ok.click(function () {
            $table.bootstrapTable('refresh');
        });
    });

    function queryParams() {
        var params = {};
        $('#toolbar').find('input[name]').each(function () {
            params[$(this).attr('name')] = $(this).val();
        });
        return params;
    }

    function responseHandler(res) {
        return res.rows;
    }
</script>
</body>
</html>