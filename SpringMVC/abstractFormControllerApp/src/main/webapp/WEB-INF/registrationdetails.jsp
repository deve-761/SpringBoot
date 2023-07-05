<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Form</title>
</head>
<body>
	<h2 style="color: red" align="center">Abstract Form Controller App</h2>
	<h3 style="color: blue" align="center">Student Registration
		Details</h3>
	<center>
		<table border='1'>
			<tr>
				<td>Student Id</td>
				<td>${student.sid}</td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td>${student.sname}</td>
			</tr>
			<tr>
				<td>Student Email</td>
				<td>${student.semail}</td>
			</tr>
			<tr>
				<td>Student Mobile</td>
				<td>${student.smobile}</td>
			</tr>
		</table>
	</center>
</body>
</html>