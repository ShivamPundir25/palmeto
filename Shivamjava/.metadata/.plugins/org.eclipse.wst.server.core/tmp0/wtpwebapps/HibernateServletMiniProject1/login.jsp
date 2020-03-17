<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="home.jsp">Home</a><br>
<a href="about.jsp">About Us</a><br>
<a href="service.jsp">Services</a><br>
<a href="login.jsp">Login</a><br>
<form action="Validation" method="post">
UserId<input type="text" name="UserId" required><br>
Password<input type="password" name="Password" required><br>
<input type="submit" value="Login" /><br>
</form>
</body>
</html>