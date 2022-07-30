<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body style="text-align: center;">
<%
String Aname= (String)session.getAttribute("Aname");
String Apassword= (String)session.getAttribute("Apassword");
if(Aname.equals("admin") && Apassword.equals("123")){
%><br/><br/><br/><br/><br/><br/><br/><br/>
<h2><a href="addUser.jsp">Add Users' credentials. </a></h2><br/>
<h2><a href="addBook.jsp">Add Book  </a></h2><br/>	
<h2><a href="editBook.jsp">Edit Book  </a></h2><br/><br/><br/><br/>	
<h2><a href="index.jsp">Go back to login page </a></h2>
<%	
}
else{
	response.sendRedirect("index.jsp");
}
%>
</body>
</html>