<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body style="text-align: center;">
<% 
String Aname = request.getParameter("Aname");
String Apassword = request.getParameter("Apassword");
String Lname = request.getParameter("Lname");
String Lpassword = request.getParameter("Lpassword");
String Rname = request.getParameter("Rname");
String Rpassword = request.getParameter("Rpassword");

if(Aname!=null && Apassword!=null){
	if(Aname.equals("admin") && Apassword.equals("123")){
	session.setAttribute("Aname", Aname);
	session.setAttribute("Apassword", Apassword);
	response.sendRedirect("admin.jsp");
	}
	else{
		response.sendRedirect("index.jsp");
	}
}
else if(Lname!=null && Lpassword!=null){
	out.print("ll");
}
else if(Rname!=null && Rpassword!=null){
	out.print("rr");
}
else{
	response.sendRedirect("index.jsp");
}
%>
</body>
</html>