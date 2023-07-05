<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Status Page</title>
</head>
<body>
	<h2 style="color: red" align="center">Simple Form Controller App</h2>
	<h3 style="color: green" align="center">User Registration Status</h3>
	<center>
		<table border="1" style="background: lightyellow">
			<tr>
				<td>User Name</td>
				<td>${user.uname}</td>
			</tr>
			<tr>
				<td>R U Married</td>
				<td>${user.maritalStatus1}</td>
			</tr>
			<tr>
				<td>R U Single</td>
				<td>${user.maritalStatus2}</td>
			</tr>
			<tr>
				<td>User Qualifications</td>
				<td><c:forEach var="qual" items="${user.uqual}">
						<c:out value="${qual}" />
						<br>
					</c:forEach></td>
			</tr>
			<tr>
				<td>User Gender</td>
				<td>${user.ugender}</td>
			</tr>
			<tr>
				<td>User Work Location</td>
				<td>${user.uworkLocation}</td>
			</tr>
			<tr>
				<td>User Skill Set</td>
				<td><c:forEach var="skill" items="${user.uskillSet}">
						<c:out value="${skill}" />
						<br>
					</c:forEach></td>
			</tr>
			<tr>
				<td>User Hobbiles</td>
				<td><c:forEach var="hobbit" items="${user.uhobbies}">
						<c:out value="${hobbit}" />
						<br>
					</c:forEach></td>
			</tr>
			<tr>
				<td>User Profession</td>
				<td>${user.uprofession}</td>
			</tr>
			<tr>
				<td>User Address</td>
				<td>${user.uaddr}</td>
			</tr>
		</table>
	</center>
	<h3 align="center">
		<a href="reg">User Registration Form</a>
	</h3>
</body>
</html>