<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>

<style>
.form-container{
	margin: 10% auto;
	display: block;
	width: 500px;
	text-align: center;
	margin-top: 80px;
	position:relative;
	max-width: 90%;
	padding: 100px 400px 100px 400px;
	max-height: 90%;
	background: rgba(255, 255, 255, .2);
	box-shadow: 40px 50px 50px rgba(0, 0, 0, .8);
	border-radius: 25px 25px 25px 25px;
}

body{
	margin: 0 auto;
	font-family: Arial;
	background-image: url("https://images.unsplash.com/photo-1432821596592-e2c18b78144f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8Ym9vayUyMHdlYnNpdGV8ZW58MHx8MHx8&auto=format&fit=crop&w=1400&q=60");
	background-size: cover;
	
}

input[type="password"],[type="text"]{
	background-color: #cce3de;
	align-content:center;
	margin-bottom: 10px;
	padding-top: 10px;
	padding-bottom: 10px;
	padding-right: 200px;
	padding-left: 10px; 
}

input[type="submit"]{
	padding-top: 10px;
	padding-bottom: 10px;
	padding-right: 50px;
	padding-left: 50px; 
	margin-left: 230px;
	background-color: #219ebc;
	border-radius: 20px;
	border-color: #4361ee;
}
.bt{
	margin-top: 10px;
	color: black;
}


</style>

<body>

<div class="form-container" align="left">
<h1 style="color: white;" align="center">Login</h1>

<section>
<form action="LoginServ">
<input type="text" placeholder="Enter Username" name="u">
<br>
<input type="password" placeholder="Enter Password" name="p">
<br>
<input type="submit" value="Login">
</form>
<div class="bt">
<a href="Forgot">Forgot Password</a>
</div>
</section>
</div>


</body>
</html>