<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>View User</title>
</head>
<style>
body{
	margin: 0 auto;
	font-family: Arial;
	background-image: url("https://images.unsplash.com/photo-1533035353720-f1c6a75cd8ab?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80");
	background-size:cover;
	width: 100%;
	height: 100%;
}

</style>

<body>

<%@page import="com.Database.BookDaoImpl,com.Model.Book,java.util.*" %>

<h2 align="center" style="padding-left: 20px">Books</h2>
<hr color="black">

<%
BookDaoImpl bdi = new BookDaoImpl();
List<Book> ls=bdi.showBooks();
//out.println("hh : "+ls);
request.setAttribute("List",ls);
%>

<div align="center">
<table border="5" width="80%">

<tr><th>Book Id</th><th>Book Name</th><th>Book Price</th><th>Edit</th><th>Delete</th></tr>

<c:forEach items="${List}" var="b">
<tr><td>${b.getBookid()} </td><td>${b.getBookname()} </td><td>${b.getBookprice()}</td>

<td><a href="EditBook.jsp?id=${b.getBookid()}">Edit</a></td>  
<td><a href="DeleteBook.jsp?id=${b.getBookid()}">Delete</a></td></tr>  
</c:forEach>

</table>
</div>

<br>
<h3 align="right" style="padding-right: 200px; color:Black"><a href="AddBook.jsp">Click here to add new book...</a></h3>

</body>
</html>