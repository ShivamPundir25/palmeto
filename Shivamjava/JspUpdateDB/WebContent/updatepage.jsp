<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" 
    import="java.sql.*" import="javax.util.*"%>
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
	String id=request.getParameter("branch_id");
	//getting paramter from html page
	String name=request.getParameter("branch_name");
	String city=request.getParameter("branch_city");
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	Connection connection=DriverManager.
	getConnection("jdbc:mysql://localhost:3306/bms2",
			"root","root");
//	out.print("hiaririii");
	String querry="update branch_master set branch_name=?,branch_city=? where branch_id=?";
    PreparedStatement pst=connection.prepareStatement(querry);
  pst.setString(1,name);
    pst.setString(2,city);
    pst.setString(3,id);
    int rs=pst.executeUpdate();
    if(rs!=0)
    {out.print("value are updated");} else{out.print("nOt");}
    %>
			
<% }
catch(Exception e) {out.print(e);}
%>
</body>
</html>