<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
  <c:set var="num" value="1000"/>
  
  <c:out value="${num}"/>
  
  <c:choose>
  
  <c:when test="${num<=500}">
  
   condition is true
  
  </c:when>
  
  <c:when test="${num>=500}">
  
   condition is false
  
  </c:when>
  
  <c:otherwise>
    default condition executed
  </c:otherwise>
  
  
  </c:choose>