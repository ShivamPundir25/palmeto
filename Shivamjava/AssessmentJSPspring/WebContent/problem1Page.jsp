<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int age=Integer.parseInt(request.getParameter("age"));
String name=request.getParameter("username");
double price;
if(age>62)
	price=7.00;
else if(age<10)
	price=5.00;
else
	price=9.50;
out.println("Your name is: "+name);%><br>
<%out.println("Your age is: "+age);%><br>
<%out.println("price is $"+price);%>

</body>
</html>
