<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Form</title>
</head>
<body>
	<h2 style="color:red">Spring Boot JDBC Application</h2>
	<h3 style="color:blue">Student Details</h3>
	<table border="1">
		<tr>
			<td>Student Id</td>
			<td>${std.sid}</td>
		</tr>
		<tr>
			<td>Student Name</td>
			<td>${std.sname}</td>
		</tr>
		<tr>
			<td>Student Address</td>
			<td>${std.saddr}</td>
		</tr>
	</table>
</body>
</html>