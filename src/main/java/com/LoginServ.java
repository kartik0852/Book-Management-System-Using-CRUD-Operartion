package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Database.EmpDaoImpl;
import com.Model.Emp;

@WebServlet(name="/LoginServ", urlPatterns = "/LoginServ")
public class LoginServ extends HttpServlet {
		
		static EmpDaoImpl ed=null;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method here");
		try {
			ed= new EmpDaoImpl();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		Emp e = null;
		
		try {
			e=ed.login(request.getParameter("u"), request.getParameter("p"));
			HttpSession s = request.getSession();
			s.setAttribute("USerId", e.getEmpname());
			response.sendRedirect("AddBook.jsp");
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		out.println("<html><head></head><body bgcolor='blue'>"+"hello:"+e.getEmpname()+'"'+"</body></html>");
		
	}

}
