<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String uid=request.getParameter("uid");
String pwd=request.getParameter("pwd");
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection con=DriverManager.
getConnection("jdbc:mysql://localhost:3306/cts",
		"root","root");
String querry="select * from credentials where user_id=?";
PreparedStatement pst=con.prepareStatement(querry);
pst.setString(1,uid);
ResultSet rs=pst.executeQuery();

%>>
</body>
</html>