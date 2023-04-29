<%@page import="com.Database.BookDaoImpl"%>	<!-- Page Directory, import java class in jsp-->
<jsp:useBean id="addbook" class="com.Model.Book"></jsp:useBean>
<jsp:setProperty property="*" name="addbook"/>

<%
BookDaoImpl bdi = new BookDaoImpl();
out.println(addbook);
int i=bdi.save(addbook);
if(i>0){
	response.sendRedirect("addBook-success.jsp");
}
else{
	response.sendRedirect("addBook-error.jsp");	
	}
%>