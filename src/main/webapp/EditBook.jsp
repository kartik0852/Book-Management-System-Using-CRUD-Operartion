<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<style>
.form-container{
	margin: 1% auto;
	display: block;
	width: 300px;
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
	background-image: url("https://images.pexels.com/photos/696644/pexels-photo-696644.jpeg?auto=compress&cs=tinysrgb&w=600");
	background-repeat: no-repeat;
	background-size: cover;
	
}

input[type="number"],[type="text"]{
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
	padding-left: 500px; 
	margin-left: 220px;
}

h1{
	margin-left: 40px;
	margin-top: 50px;
	margin-bottom: -10px;
	color: #ade8f4;
	
}

hr{
	color:black;
}


</style>


<body>
<h1 align="center">Edit Book List)</h1>
<hr>
<div class="form-container">
<section>
<form action="DeleteBook.jsp" method="post">
<div>

<input type="number" name="bookid" placeholder="Enter Book Id">

<input type="submit" value="Delete Book" style="background-color: #219ebc; padding-left: 50px; border-radius: 20px">
</div>
</form>
</section>
</div>

</body>
</html>