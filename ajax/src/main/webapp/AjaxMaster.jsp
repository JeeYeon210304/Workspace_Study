<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax Master...sibal</title>
<!-- TODO 에이젝스 자바스크립트 하는중 -->
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

$(function(){
	$('emp_search').click(function(){
		var empid = $('input[name=empid]').val();
		if (!isNaN(empid) && empid.length > 2){
			$.ajax({
				url: "./emplist.xml",
				method: "get",
				async: true,
				dataType: "xml",
				success: function(data){
					var empInfo = $(data).find("EMPLOYEE_ID:Contains("+empid+")").parent();
					
					if(empInfo.is("ROW")){
						$("table input").each(function(i){
							$(this).val($(empInfo).children().eq(i).text());
						});
					}
				},
				error: function(request, error){
					alert("code: " + request.status+"\n" + 
						"message: " + request.responseText + "\n" +
						"error: " + error);
				}
			});
		} else {
			alert("사원번호를 확인해주세요");
		}
	});
});

$(function(){
	$('#test').click(function(){
		alert("test");
	});
});
</script>
</head>
<body>
	<filedset>
		<legend>Search for employee</legend>
		<input type="text" name="empid" />
		<input type="button" id="emp_search" value="조회" />
		<input type="button" id="test" value="script test" />
	</filedset>

	<table>
		<tr>
			<th>employee ID</th>
			<td><input type="text" name="empid"/></td>
		</tr>
		<tr>
			<th>name</th>
			<td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<th>email</th>
			<td><input type="text" name="email"/></td>
		</tr>
		<tr>
			<th>phone number</th>
			<td><input type="text" name="phonenumber"/></td>
		</tr>
		<tr>
			<th>hire date</th>
			<td><input type="text" name="hiredate"/></td>
		</tr>
	</table>
</body>
</html>