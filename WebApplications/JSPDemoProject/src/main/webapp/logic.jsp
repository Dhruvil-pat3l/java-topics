<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fibonacci Series</title>
</head>
<body style="text-align:center;">
<%@ include file="index.jsp" %>
<%
int age = Integer.parseInt(request.getParameter("age"));
int count =Integer.parseInt(request.getParameter("count"));
if(age ==0|| count==0){
	%>   <%= "Enter Valid Number." %> <%
}
else if(count==1){
	 out.print("Fibonacci of "+count+" Numbers : 0");
}
else if(count==1){
	 out.print("Fibonacci of "+count+" Numbers : 0, 1");
}
else if(age>18){
	out.print("Fibonacci of "+count+" Numbers : ");
	for(int i = 0; i< count ; i++){
		out.print(fibonacci(i)+", ");
	}
}
else{
	 int first=0, second=1, addition;
	 out.print("Fibonacci of "+count+" Numbers : ");
	 out.print(first+", "+second);
	 for(int i=1;i<=(count-2);i++){
		 addition=first+second;
		 out.print(", "+addition);
		 first=second;
		 second=addition;
	 }
}
%>
<%! int fibonacci(int index){
	if(index==0){
		return 0;
	}
	if(index==1 || index==2){
		return 1;
	}
	return (fibonacci(index-1) + fibonacci(index-2));	
	}
%>
</body>
</html>