<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
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
      
       
      
      
      