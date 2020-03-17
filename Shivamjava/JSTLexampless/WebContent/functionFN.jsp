<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.io.*,java.util.*,java.sql.*,javax.servlet.http.*,javax.servlet.*"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="string1" value="Shivam Pratap Singh" > </c:set>
<c:if test="${fn:contains(string1,'Singh') }" >
   <p> Found in first loop</p>
</c:if>
<c:if test="${fn:containsIgnoreCase(string1,'singh')}"> 
<h6>FOUND in 2nd loop</h6>
</c:if>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
url="jdbc:mysql://localhost/cts" user="root" password="root"
/> 

<%-- <sql:update dataSource="${db }" var="count">
insert into credentials values("surya","kaja");
</sql:update> --%>

<c:set var="NAME" value="<%= request.getParameter(\"name\") %>">
</c:set>
<c:set var="PWD" value="<%= request.getParameter(\"pwd\") %>">
</c:set>
<sql:update dataSource="${db }" var="count">
insert into credentials values(?,?);
<sql:param value="${NAME }"></sql:param>
<sql:param value="${PWD }"></sql:param>
</sql:update>

<sql:query dataSource="${db}" var="rs">
select * from credentials;</sql:query>

<table border="2" width="50px">
<tr>
<th>USER ID</th> 
<th>PAsSWORD</th>
</tr>
<c:forEach var="table" items="${rs.rows }" >
<tr>
<td><c:out value="${table.user_id }" /></td>
<td><c:out value="${table.password }"/></td>
</tr>
</c:forEach>
</table>



</body>
</html>