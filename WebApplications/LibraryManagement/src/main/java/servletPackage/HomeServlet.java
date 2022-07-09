package servletPackage;
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
public class HomeServlet extends HttpServlet {  
     
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    					throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        HttpSession session = request.getSession(false);
        
 /**    System.out.println("Session Id : "+session.getId());
        System.out.println("Creation Time : "+session.getCreationTime());
        System.out.println("Last accessed Time : "+session.getLastAccessedTime());
        System.out.println("max inactive "+session.getMaxInactiveInterval());			*/
        
        if(session!=null) {
        	String name= (String) session.getAttribute("name");
        	out.print("<center><br/>Hello <b>"+name +"</b>, Welcome to home Page."
        			+"<br/><a href=\"LogoutServlet\">Logout</a></center>");
        
        	request.getRequestDispatcher("findRecord.html").include(request,response);
        
        }
        else {
        //	out.print("<center><br/>For Login, Enter correct details.</center>");
        	request.getRequestDispatcher("Login.html").include(request,response);
        }
        out.close();
        
    }  
}  