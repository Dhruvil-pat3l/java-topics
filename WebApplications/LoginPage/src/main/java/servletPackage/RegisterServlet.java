package servletPackage;

import java.io.IOException;
import java.util.LinkedHashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 request.getRequestDispatcher("Login.html").include(request, response);  
		
		 String name= request.getParameter("name");
	     String password = request.getParameter("password");
	
	     
	     if(name!=null && password!=null) {
	    	 HttpSession session = request.getSession();
	       	session.setAttribute("name", name);
	       	session.setAttribute("password", password);
	     }
	    
	}
}
