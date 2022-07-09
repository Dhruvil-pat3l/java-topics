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
        if(session!=null) {
        	String name= (String) session.getAttribute("name");
        	out.print("<center><br/>Hello <b>"+name +"</b>, Welcome to home Page"
        			+ "<br/><br/><a href=\"LogoutServlet\">Logout</a> </center>");
        }
        else {
        //	out.print("<center><br/>For Login, Enter correct details.</center>");
        	request.getRequestDispatcher("Login.html").include(request,response);
        }
        out.close();
        
    }  
}  