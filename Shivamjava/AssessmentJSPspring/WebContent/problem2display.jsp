<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" import="java.sql.*"
    import="javax.servlet.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection connection=DriverManager.
getConnection("jdbc:mysql://localhost:3306/cts","root","root");
String querry="select * from book";
PreparedStatement pst=connection.prepareStatement(querry);
ResultSet rs=pst.executeQuery();
%>
	<h3>Books are....</h3><br>
	<form action="problem2add.jsp">
	<% while(rs.next())
{
	%>
	Book_title<input type="text" name="book_title" 
	value="<%=rs.getString(1)%>"></br>
	Author_of_book<input type="text" name="author_of_book"
	value="<%=rs.getString(2)%>"></br>
	Publisher<input type="text" name="publisher"
	value="<%=rs.getString(3)%>"></br>
	Year_of_publication<input type="text" name="year_of_publication"
	value="<%=rs.getInt(4)%>"></br>
	Price<input type="text" name="price"
	value="<%=rs.getInt(5)%>"></br>
	<input type="button" value="add">
	<%
	System.out.println("   ");
	} %>
	</br>
	<input type="submit" value="addall">
	</form>
<%
pst.close();
connection.close();
%>

</body>
</html>






