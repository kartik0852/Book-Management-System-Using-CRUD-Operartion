<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	div {

		}
	
	section{
		justify-content: center;
		display: flex;
	}
	
	
	
	a{
		align: center;
	}
</style>
<meta charset="UTF-8">
<title>Save Record</title>
</head>
<body>
<section>
<div class="trans" align="center">

<jsp:include page="AddBook.jsp"></jsp:include>

<div class="2nd" style="padding:5px 0px 5px 0px ">

<h3 align="center">Record successfully saved....</h3>
<p align="center">Click here to see updated book details --> <a href="View.jsp">See Details</a></p>
</div>
</div>
</section>

</body>
</html>