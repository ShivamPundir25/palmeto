<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("name");
String age=request.getParameter("age");
out.print("your name is " +name);
out.print("your age is " +age);
session.setAttribute("sname", name);
session.setAttribute("sage",age);

%>
<a href="Session2.jsp" >Check output</a>
</body>
</html>