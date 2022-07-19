<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Circular Sequence</title>
</head>
<body style="text-align:center;">
<%@ include file="index.jsp" %>
<%
String str1 = request.getParameter("str1");
String str2 = request.getParameter("str2");
StringBuffer strTemp = new StringBuffer("");

if(onlyCharacter(str1) && onlyCharacter(str2)){
	for(int i=str1.length()-1;i>=0;i--){
		strTemp.append(str1.charAt(i));
	}
	String reverse = strTemp.toString();
	if(reverse.equals(str2)){
		out.print("<br/>Both Strings are in circular sequence.");
	}
	else{
		out.print("<br/>Both Strings are <b>not</b> in circular sequence.");
	}
}
else{
	out.print("<br/>Enter a string of only character.");
}
%>
<%!  boolean onlyCharacter(String str){
	boolean bln = true;
		for(int i=0;i<str.length(); i++){
			char temp = str.charAt(i);
			if( !((temp>='A' && temp<='Z') || (temp>='a' && temp<='z')) ){
				bln = false;
			}
		}
		return bln;
	 }
%>
</body>
</html>