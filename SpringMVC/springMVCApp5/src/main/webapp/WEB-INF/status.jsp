<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Status Page</title>
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