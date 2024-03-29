package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", 
			urlPatterns = { "/AdvancedServletPath" }, 
			initParams = {@WebInitParam(name="defaultUser", value="John DOE")}
)
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Hello from GET method");
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();		
		String userName = request.getParameter("userName");
		
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		
		
		if (userName != "" && userName != null) {
			
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		
		out.println("<h3>Request parameter has username as : " + userName + "!</h3>");
		out.println("<h3>Request parameter has username as : " + (String) session.getAttribute("savedUserName") + "!</h3>");
		out.println("<h3>Context parameter has username as : " + (String) context.getAttribute("savedUserName") + "!</h3>");
		out.println("<h3>Init parameter has username as : " + (String) this.getServletConfig().getInitParameter("defaultUser") + "!</h3>");
	}

}
