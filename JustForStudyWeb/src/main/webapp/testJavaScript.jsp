<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavaScript TEST</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#A").click(function(){
			alert("test");
		});
	});
</script>
</head>
<body>
<input type="button" value="click" id="A" />
<table>
	<tr>
		<th>column1</th>
		<th>column2</th>
	</tr>
	<tr>
		<td>1</td>
		<td>2</td>
	</tr>
	<tr>
		<td>3</td>
		<td>4</td>
	</tr>
</table>

</body>
</html>