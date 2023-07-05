<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Form</title>
</head>
<body>
	<jsp:include page="/WEB-INF/welcome.jsp"/>
	<br><br><br><br>
	<form action="search" method="POST">
		<table align="center">
			<tr>
				<td>Student Id</td>
				<td><input type="text" name="sid" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Search" /></td>
			</tr>
		</table>
	</form>
</body>
</html>