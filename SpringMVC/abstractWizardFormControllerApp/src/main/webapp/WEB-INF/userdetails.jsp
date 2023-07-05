<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Form</title>
</head>
<body>
	<h2 style="color:red">Abstract Wizard Form
		Controller App</h2>
	<h3 style="color:blue">User Registration Details</h3>
	<table border="1">
		<tr>
			<td>First Name</td>
			<td>${user.fname}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${user.lname}</td>
		</tr>
		<tr>
			<td>User Qualification</td>
			<td>${user.uqual}</td>
		</tr>
		<tr>
			<td>User Designation</td>
			<td>${user.udes}</td>
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
	<h3 align="center">
	<a href="welcomepage">Welcome Page</a>
	</h3>
</body>
</html>