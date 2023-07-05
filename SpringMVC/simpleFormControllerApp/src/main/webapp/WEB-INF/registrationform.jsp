
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Form</title>
</head>
<body>
	<h2 style="color: red" align="center">Simple Form Controller App</h2>
	<h3 style="color: blue" align="center">User Registration Form</h3>
	<form:form action="reg" method="POST" commandName="user">
		<center>
			<table style="background: lightyellow;">
				<tr>
					<td>User Name</td>
					<td><form:input path="uname" size="20" value="User Name" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:password path="upwd" value="abc123"
							showPassword="true" /></td>
				</tr>
				<tr>
					<td>R U Married</td>
					<td><form:checkbox path="maritalStatus1" /></td>
				</tr>
				<tr>
					<td>R U Single</td>
					<td><form:checkbox path="maritalStatus1" /></td>
				</tr>
			 	<tr>
					<td>User Qualifications</td>
					<td><form:checkboxes items="${qual_List}" path="uqual" /></td>
				</tr> 
				<tr>
					<td>User Gender</td>
					<td><form:radiobutton path="ugender" value="Male" />Male <form:radiobutton
							path="ugender" value="Female" />Female</td>
				</tr>
				 <tr>
					<td>User Work Location</td>
					<td><form:radiobuttons path="uworkLocation"
							items="${uworkLocation}" /></td>
				</tr> 
				<tr>
					<td>User Skill Set</td>
					<td><form:select path="uskillSet" multiple="true">
							<form:option value="C">C</form:option>
							<form:option value="C++">C++</form:option>
							<form:option value="Java">Java</form:option>
							<form:option value=".Net">.Net</form:option>
							<form:option value="Oracle">Oracle</form:option>
						</form:select></td>
				</tr>
				<tr>
					<td>User Hobbies</td>
					<td><form:select path="uhobbies" items="${uhobbies}"
							multiple="true" /></td>
				</tr>
				<tr>
					<td>User Profession</td>
					<td><form:select path="uprofession" multiple="false">
							<form:options items="${uprofession}" />
						</form:select></td>
				</tr>
				<tr>
					<td>User Address</td>
					<td><form:textarea path="uaddr" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Registrtion" /></td>
				</tr>
			</table>
		</center>
	</form:form>
</body>
</html>