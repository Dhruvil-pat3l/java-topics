<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Array Program</title>
</head>
<body style="text-align:center;">
<%@ include file="form.jsp" %>
<%
int count = Integer.valueOf(request.getParameter("count"));
out.print("<br/><br/>Array output in given group size of <b>" +count+"</b>.<br/><br/>");
String elements = request.getParameter("elements");
String[] arrElements = elements.split(" ");
int length = arrElements.length;
int[] array = new int[length];
for(int i=0;i<length;i++){
	try{
		if(arrElements[i].trim()!=null && arrElements[i].trim()!="")	{
			array[i]= Integer.valueOf(arrElements[i].trim());
		}
	}
	catch(Exception e){System.out.println(e);}
}
int temp=0;
for(int i=0;i<array.length;i++){
	if(temp==count){
		out.print("<br/>");
		temp=0;
	}
	temp++;
	out.print(array[i]+", ");
}
%>
</body>
</html>