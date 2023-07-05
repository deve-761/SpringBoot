<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style type="text/css">
.error {
	color: red;
	font-family: consolas;
	font-style: italic;
	font-weight: bold;
	font-size: large;
}
</style>
</head>
<body>
	<h2 style="color: red" align="center">Spring MVC Form Data
		Validation App</h2>
	<h3 style="color: blue" align="center">User Registration Form</h3>
	<form:form action="reg" method="POST" commandName="user">
		<center>
			<table style="background: lightyellow;">
				<tr>
					<td>User Name</td>
					<td><form:input path="uname" /></td>
					<td><form:errors path="uname" cssClass="error" /></td>
				</tr>
				<tr>
					<td>User Password</td>
					<td><form:password path="upwd" /></td>
					<td><form:errors path="upwd" cssClass="error" /></td>
				</tr>
				<tr>
					<td>User Age</td>
					<td><form:input path="uage" /></td>
					<td><form:errors path="uage" cssClass="error" /></td>
				</tr>
				<tr>
					<td>User Date Of Birth</td>
					<td><form:input path="udob" /></td>
					<td><form:errors path="udob" cssClass="error" /></td>
				</tr>
				<tr>
					<td>User Email Id</td>
					<td><form:input path="uemail" /></td>
					<td><form:errors path="uemail" cssClass="error" /></td>
				</tr>
				<tr>
					<td>User Mobile No</td>
					<td><form:input path="umobile" /></td>
					<td><form:errors path="umobile" cssClass="error" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Registrtion" /></td>
				</tr>
			</table>
		</center>
	</form:form>
</body>
</html>