<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px" width="50%" bgcolor="skyblue" cellpadding="10px"
 cellspacing="0px">
 <th>ID</th>
 <th>Name</th>
 <th>Marks</th>
 <c:forEach var="list" items="${studentlist}">
 <tr>
 <td>${list.getId()}</td>
 <td>${list.getName()}</td>
 <td>${list.getMarks()}</td>
 </tr>
 </c:forEach>
 </table>
</body>
</html>