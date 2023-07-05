<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Form</title>
</head>
<body>
	<h2 style="color:red" align="center">Abstract Form Controller App</h2>
	<h3 style="color:blue" align="center">Student Registration Form</h3>
	<form action="reg" method="POST">
		<table>
			<tr>
				<td>Student Id</td>
				<td><input type="text" name="sid" /></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="sname" /></td>
			</tr>
			<tr>
				<td>Student Email</td>
				<td><input type="text" name="semail" /></td>
			</tr>
				<tr>
				<td>Student Mobile</td>
				<td><input type="text" name="smobile" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Registrtion" /></td>
			</tr>
		</table>
	</form>
</body>
</html>