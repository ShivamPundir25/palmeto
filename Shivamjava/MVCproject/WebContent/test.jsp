<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,data.MvcEmployee"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<MvcEmployee> ar = new ArrayList<MvcEmployee>();
	MvcEmployee m1 = new MvcEmployee();
	m1.setEmpid(100);
	m1.setEname("praveen");
	m1.setDept("Testing");
	m1.setDesg("Teste");
	m1.setEmail("xyz@gmail.com");
	MvcEmployee m2 = new MvcEmployee();
	m2.setEmpid(101);
	m2.setEname("kumar");
	m2.setDept("Testing");
	m2.setDesg("Teste");
	m2.setEmail("xyz@gmail.com");
	ar.add(m1);
	ar.add(m2);

%>
<table>
<c:forEach items="${ar}" var="u">
<tr>
<td>Hello</td>
<td>Hai</td>
<td>Howareyou</td>
<td>Happy</td>
<td>Welcome</td>
</tr>
</c:forEach>
</table>


</body>
</html>