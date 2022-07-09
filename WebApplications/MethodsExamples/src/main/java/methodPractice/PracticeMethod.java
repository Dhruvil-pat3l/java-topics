package methodPractice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PracticeMethod
 */
@WebServlet("/PracticeMethodURL")
public class PracticeMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PracticeMethod() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		headerinfo(request,response);
	}
	
	public void headerinfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  response.setContentType("text/html");  
	      PrintWriter out = response.getWriter();  
	        
	      out.print("<br/>Server port : "+request.getServerPort());  
	      
	      out.print("<br/>Server Name : "+request.getServerName());
	      
	      out.print("<br/>Server Path : "+request.getServletPath()); 
	      
	      out.print("<br/>Auth. Type : "+request.getAuthType()); 
	      
	      out.print("<br/>Content Type :  "+response.getContentType()); 
	      
	      out.print("<br/>Local Name : "+request.getLocalName()); 
	      
	      ServletContext sc = getServletContext();
	      
	      String cName = sc.getInitParameter("Second");
	      out.print("<br/>Context Param Value of \"Second\" : "+cName);
	      out.print("<br/> Servlet Context Parameters Names : ");
	      
	      Enumeration<String> es = sc.getInitParameterNames();
	      
	      while(es.hasMoreElements()) {
	    	  out.print("<br/>"+sc.getInitParameter(es.nextElement()));
	      }
	      
	      out.println("<br/><br/><br/>HTTP headers<br/>");  
	        
	      Enumeration<String> enum1 = request.getHeaderNames();  
	      while (enum1.hasMoreElements()) {  
	      String headerName = (String) enum1.nextElement();  
	      String headerValue = request.getHeader(headerName);  
	      out.println(headerName + ": "+headerValue + "<br>");  
	    
	      }  
	      
	      
	}
}
