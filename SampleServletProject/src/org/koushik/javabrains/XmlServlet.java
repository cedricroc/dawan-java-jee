package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("XML Servlet doGet called!");		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();		
		String userName = request.getParameter("userName");
		
		out.println("Hello from get method " + userName + "!");
		out.println("<h3>Init parameter has username as : " + (String) this.getServletConfig().getInitParameter("defaultUser") + "!</h3>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("XML Servlet doPost called!");		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();		
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		
		out.println("Hello from post method " + userName + "! Your full name is " + fullName);
		
		String prof = request.getParameter("prof");
		out.println("you are a " + prof);
		
//		String location = request.getParameter("location");
		String[] location = request.getParameterValues("location");
		out.println("you are at " + String.valueOf(location.length) + "places");
		
		for(int i=0; i<location.length; i++) {
			
			out.println(location[i]);
		}
	}
}
