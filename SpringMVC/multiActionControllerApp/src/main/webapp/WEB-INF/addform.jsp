<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Form</title>
</head>
<body>
	<h2 style="color:red">Multi Action Controller App</h2>
	<h3 style="color:blue">Student Add Form</h3>
	<form action="add" method="POST">
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
				<td>Student Address</td>
				<td><input type="text" name="saddr" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="ADD" /></td>
			</tr>
		</table>
	</form>
</body>
</html>