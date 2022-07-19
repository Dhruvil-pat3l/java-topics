<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Form</title>
</head>
<body style="text-align:center;"><br/>

<form action="stringPattern.jsp" method="post">
[1] Enter String : <input type="text" name="strInput" required />
<input type="submit" value="Submit" /><br/><br/><br/><br/>
</form>

<form action="arrayInput.jsp" method="post">
[2] Enter Integer Elements of Array, separate them using <i><b>space</b></i> : 
<input type="text" name="elements" required /><br/><br/>
Enter size of group : <input type="number" name="count" required />
<input type="submit" value="Submit" /><br/>
</form>

</body>
</html>