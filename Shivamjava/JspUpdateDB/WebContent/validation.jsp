<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="java.sql.*"
    import="javax.servlet.*"
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
 charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
try{
String id=request.getParameter("id");
//getting paramter from html page
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

//Class.forName("com.mysql.jdbc.Driver");
Connection connection=DriverManager.
getConnection("jdbc:mysql://localhost:3306/bms2","root","root");
String querry="select * from branch_master where branch_id=?";
PreparedStatement pst=connection.prepareStatement(querry);
pst.setString(1,id);
ResultSet rs=pst.executeQuery();

if(rs.next())
{
	%><h3>details are below.......</h3><br>
	<form action="updatepage.jsp">
	Branch_id<input type="text" readonly name="branch_id" 
	value="<%=rs.getString(1)%>"><br>
	Branch_name<input type="textarea" name="branch_name"
	value="<%=rs.getString(2)%>"><br>
	Branch_city<input type="textarea" name="branch_city"
	value="<%=rs.getString(3)%>"><br>
	<input type="submit" value="update">
	</form>
<%} 
else {%> <h2>User not found</h2><% }
pst.close();
connection.close();}
catch(Exception e){out.print(e);}
%>
</body>
</html>