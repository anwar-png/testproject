<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@page import="java.util.ArrayList" %>  
  
   <%-- <c:set var="username" value="Anwar" scope="session"/>
   <c:out value="${username}"/> --%>
 <%--   
   <c:forEach var="count" begin="1" end="50">
   
    <c:out value="${count}"/>
   
   </c:forEach> --%>
   
   <%
    ArrayList<String> al=new ArrayList<String>();
     
    al.add("Red");
    al.add("Blue");
    al.add("Green");
    
     session.setAttribute("list",al);
   
  
   %>
    <jsp:forward page="jstl2.jsp"/>
   