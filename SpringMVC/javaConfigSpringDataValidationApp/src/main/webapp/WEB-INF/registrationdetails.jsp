<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Status Page</title>
</head>
<body>
	<h2 style="color: red" align="center">Spring MVC Form Data
		Validation App</h2>
	<h3 style="color: green" align="center">User Registration Details</h3>
	<center>
		<table border="1">
			<tr>
				<td>User Name</td>
				<td>${user.uname}</td>
			</tr>
			<tr>
				<td>User Password</td>
				<td>${user.upwd}</td>
			</tr>
			<tr>
				<td>User Age</td>
				<td>${user.uage}</td>
			</tr>
			<tr>
				<td>User Date Of Birth</td>
				<td>${user.udob}</td>
			</tr>
			<tr>
				<td>User Email Id</td>
				<td>${user.uemail}</td>
			</tr>
			<tr>
				<td>User Mobile No</td>
				<td>${user.umobile}</td>
			</tr>
		</table>
	</center>
</body>
</html>