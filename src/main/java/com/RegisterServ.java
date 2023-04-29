package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.Database.EmpDaoImpl;
import com.Model.Emp;

@WebServlet(name="/RegisterServlet", urlPatterns = "/register")
public class RegisterServ extends HttpServlet {
	static EmpDaoImpl ed;

	public void init() throws ServletException{
		System.out.println("init method here");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		String username = request.getParameter("u");
		String password = request.getParameter("p");
		System.out.println("User Name : "+username+" Password : "+password);
		Emp e = new Emp(username, password);
		System.out.println(e);
		
		try {
			ed = new EmpDaoImpl();
			ed.register(e);
			HttpSession s = request.getSession();
			s.setAttribute("UserId", e.getEmpname());
			
			response.sendRedirect("Login.jsp");
		}
		catch (Exception a) {
			// TODO: handle exception
		}
	}

}
