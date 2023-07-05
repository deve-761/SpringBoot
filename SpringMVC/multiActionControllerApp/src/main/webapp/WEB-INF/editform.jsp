<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Form</title>
</head>
<body>
	<h2 style="color:red">Multi Action Controller App</h2>
	<h3 style="color:blue">Student Edit Form</h3>
	<form action="update" method="POST">
		<table>
			<tr>
				<td>Student Id</td>
				<td>${sto.sid}<input type="hidden" name="sid" value='${sto.sid}'/></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><input type="text" name="sname" value='${sto.sname}'/></td>
			</tr>
			<tr>
				<td>Student Address</td>
				<td><input type="text" name="saddr" value='${sto.saddr}'/></td>
			</tr>
			<tr>
				<td><input type="submit" value="UPDATE" /></td>
			</tr>
		</table>
	</form>
</body>
</html>