<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form 1</title>
</head>
<body>
	<h2 style="color: red" align="center">Abstract Wizard Form
		Controller App</h2>
	<h3 style="color: blue" align="center">User Registration Form</h3>
	<form:form method="POST" commandName="user">
		<center>
			<table>
				<tr>
					<td>User Email Id</td>
					<td><form:input path="uemail" /></td>
				</tr>
				<tr>
					<td>User Mobile No</td>
					<td><form:input path="umobile" /></td>
				</tr>
				<tr>
					<td colspan="2">
					<input type="submit" name="_target1" value="Previous" />
					<input type="submit" name="_finish"
						value="Finish" />
						 <input type="submit" name="_cancel" value="Cancel" />
					</td>
				</tr>
			</table>
		</center>
	</form:form>
</body>
</html>