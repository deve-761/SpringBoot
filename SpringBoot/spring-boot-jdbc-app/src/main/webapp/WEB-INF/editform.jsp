<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Form</title>
</head>
<body>
	<jsp:include page="/WEB-INF/welcome.jsp"/>
	<br><br><br><br>
	<form action="update" method="POST">
		<table align="center">
			<tr>
				<td>Student Id</td>
				<td>${std.sid}</td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="sname" value='${std.sname}'/></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="saddr" value='${std.saddr}'/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update" /></td>
			</tr>
		</table>
		<input type="hidden" name="sid" value="${std.sid}"/>
	</form>
</body>
</html>