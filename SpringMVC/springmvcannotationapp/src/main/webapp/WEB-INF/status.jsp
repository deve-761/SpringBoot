<%@page language="java" contentType="text/html;charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<html>
<head>
<title>Status Form</title>
</head>
<body>
	<h1>
		Status :
		<%=session.getAttribute("status")%>
	</h1>
	<h3>
		<a href="loginpage">|Login Form|</a>
	</h3>
</body>
</html>