package servletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	   
	        
	        String name= request.getParameter("name");
	        String password = request.getParameter("password");
	        
	        if(name.equals("Dhruvil") && password.equals("demo123")) {
	        	out.print("welcome, "+name 
	        			+ "<br/><a href=\"HomeServlet\">Go to Home Page</a> ");
	        	HttpSession session = request.getSession();
	        	session.setAttribute("name", name);
	        }
	        else {
	        	out.print("Wrong id/password");
	        	request.getRequestDispatcher("Login.html").include(request,response);
	        	
	        }
	        out.close();
	        
	        
	}

}
