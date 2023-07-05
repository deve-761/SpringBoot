<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Form</title>
</head>
<body>
	<h2>Spring Boot Login Application</h2>
	<h3>User Hello Form</h3>
	<form action="/login" method="POST">
		<table align="center">
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="upwd" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
</body>
</html>