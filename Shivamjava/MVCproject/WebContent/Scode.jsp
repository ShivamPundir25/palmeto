<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="java.util.*,data.MvcEmployee" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Employee Infomation
<table border="1" width="90%">  
<tr><th>EmpId</th><th>EName</th><th>Desg</th><th>Department</th>  
<th>Email</th></tr>  
<%
List<MvcEmployee> list = (List<MvcEmployee>)request.getAttribute("list");
List<MvcEmployee> list1 = (List<MvcEmployee>)request.getAttribute("data");
%>
<c:set var="list1" value="${list}"  > </c:set>
<c:forEach items="${list1}" var="u">  
<tr><td>${u.getEmpid()}</td>
<td>${u.getEname()}</td>
<td>${u.getDept()}</td>  
<td>${u.getDesg()}</td>
<td>${u.getEmail()}</td>  
</tr>  
</c:forEach>
<c:set var="list1" value="${list1}"  > </c:set>
<c:forEach items="${list1}" var="u">  
<tr><td>${u.getEmpid()}</td>
<td>${u.getEname()}</td>
<td>${u.getDept()}</td>  
<td>${u.getDesg()}</td>
<td>${u.getEmail()}</td>  
</tr>  
</c:forEach>  
</table>  
</body>
</html>​
