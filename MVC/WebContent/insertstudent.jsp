<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
 #forms
 {
 border:1px solid black;
 width:500px;
 height:500px;
 padding:10px;
 }
  input
 {
   width:500px;
   height:40px;
   background:skyblue;

 }
 label
 {
 font-size:20px;
 font-family:sans-serif;
 }
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student Form</h2>
<div id="forms">
<form action="rstudent" method="get">
<div><label>Id</label></div>
<input type="text" name="sid"><br><br>
<div><label>Name</label></div>
<input type="text" name="sname"><br><br>
<div><label>Marks</label></div>
<input type="text" name="smarks"><br><br>
<input type="submit" value="savestudent">
</form>
  <%
  try
  {
     String msg=(String)session.getAttribute("message").toString();
     out.println(msg);
      session.removeAttribute("message");
      
  }
  
  catch(NullPointerException npe)
  {
	  
  }
  
  %>
</div>
</body>
</html>