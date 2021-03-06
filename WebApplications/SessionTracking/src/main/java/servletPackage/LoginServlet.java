package servletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/FirstServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		try {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        String loginName= request.getParameter("name");
	        String loginPassword = request.getParameter("password");
	        
	        Cookie ck[] = request.getCookies();
	        
	        if(ck!=null && ck.length!=0) {
	        	
		        String name= ck[0].getValue(); 
		        String password=ck[1].getValue();
		        
		        if(loginName.equals(name) && loginPassword.equals(password)) {
	
		        	response.sendRedirect("HomeServlet");
		        }
		        else {
		        	response.sendRedirect("Login.html");
		        }
		        out.close();  
	        }
	        else {
	        	response.sendRedirect("Login.html");
	        }
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
