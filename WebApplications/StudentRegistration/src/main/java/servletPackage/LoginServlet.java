package servletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

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


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	   
	    /**    String name= request.getParameter("name");
	        String password = request.getParameter("password"); */
	        
	        String loginName= request.getParameter("name");
	        String loginPassword = request.getParameter("password");
	        
	        HttpSession session = request.getSession();
	        
	        String name= (String) session.getAttribute("name");
	        String password= (String) session.getAttribute("password");
	        
	        if((loginName.equals(name) && loginPassword.equals(password)) || ( loginName.equals("Dhruvil") && loginPassword.equals("123") )  ) {

	        	LinkedHashMap<Integer, LinkedHashMap<String,String>> allRecord = new LinkedHashMap<>();         		
        		session.setAttribute("record", allRecord);	
        		
	        	response.sendRedirect("HomeServlet");
	        }
	        
	        else {
	        	
	        	response.sendRedirect("Login.html");
	       
	        }
	        out.close();        
	}

}
