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
					<td>User Qualification</td>
					<td><form:input path="uqual" /></td>
				</tr>
				<tr>
					<td>User Designation</td>
					<td><form:input path="udes" /></td>
				</tr>
				<tr>
					<td colspan="2">
					<input type="submit" name="_target0" value="Previous" />
					<input type="submit" name="_target2"
						value="Next" />
						 <input type="submit" name="_cancel" value="Cancel" />
					</td>
				</tr>
			</table>
		</center>
	</form:form>
</body>
</html>