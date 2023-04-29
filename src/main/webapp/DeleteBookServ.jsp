<%@page import="com.Database.BookDaoImpl"%>	<!-- Page Directory, import java class in jsp-->
<jsp:useBean id="deletebook" class="com.Model.Book"></jsp:useBean>
<jsp:setProperty property="*" name="deletebook"/>


<%
BookDaoImpl bdi = new BookDaoImpl();
out.println(deletebook);
int i=bdi.deleteBook(deletebook);
if(i>0){
	response.sendRedirect("View.jsp");
}
else{
	out.println("<h3>Book not delete</h3>");	
	}
%>