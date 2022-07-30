<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body style="text-align: center;">
<br/>
<div  style="padding: 104px;" >

<div style="float: left; padding:147px;">
<form action="login.jsp" method="post" style="text-align: center;" >
	<br/>
	<h1>Admin Login</h1>
	<div>
    <label> Username : </label>
	<input type="text" name="Aname" required />
	</div>
	<div>
    <label> Password : </label>
    <input type="password" name="Apassword" required />
	</div><br />
	<input type="submit" value="login">
</form>
</div>

<div style="float: right; padding:34px;" >
<form action="login.jsp" method="post" style="text-align: center;" >
	<br/>
	<h1>User Login</h1>
	<div>
    <label> Username : </label>
	<input type="text" name="Lname" required />
	</div>
	<div>
    <label> Password : </label>
    <input type="password" name="Lpassword" required />
	</div><br />
	<input type="submit" value="login">
</form><br/><br/><br/><br/>
<form action="login.jsp" method="post" style="text-align: center;" >
	<br/>
	<h1>User Register</h1>
	<div>
    <label> New Username : </label>
	<input type="text" name="Rname" />
	</div>
	<div>
    <label> Password : </label>
    <input type="password" name="Rpassword"  />
	</div><br/>
	<input type="submit" value="Register"> 
</form>
</div>

</div>

</body>
</html>