<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>String Program</title>
</head>
<body style="text-align:center;">
<%@ include file="form.jsp" %>
<%@ page import="java.util.ArrayList" %> 
<%@ page import="java.util.Collections" %> 
<%
String strInput = request.getParameter("strInput");
ArrayList<Character> upperCase = new ArrayList<>();
ArrayList<Character> lowerCase = new ArrayList<>();
int ln = strInput.length();
out.print("<br/><br/>Given String : "+strInput+"<br/>Output String : ");
boolean bn=false ;
for(int i=0; i<ln; i++){
	char temp = strInput.charAt(i);
	if(temp>='a' && temp<='z'){
		lowerCase.add(temp);
	}
	if(temp>='A' && temp<='Z'){
		upperCase.add(temp);
	}
}
Collections.sort(upperCase);
Collections.sort(lowerCase);
int upperLn = upperCase.size();
int lowerLn = lowerCase.size();


	for(int i=0; i<ln;i++){
		if(i<upperLn){
			out.print(upperCase.get(i));
		}
		if(i<lowerLn){
			out.print(lowerCase.get(i));
		}
	}


%>
</body>
</html>