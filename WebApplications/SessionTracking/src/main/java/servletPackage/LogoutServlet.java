package servletPackage;

import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
public class LogoutServlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
			Cookie ckName = new Cookie("name","");
			ckName.setMaxAge(0);
			response.addCookie(ckName);
			
			Cookie ckPass = new Cookie("password","");
			response.addCookie(ckPass);
			ckPass.setMaxAge(0);
	    	 
	    	response.sendRedirect("Login.html");
             
            out.close();  
    }  
}  