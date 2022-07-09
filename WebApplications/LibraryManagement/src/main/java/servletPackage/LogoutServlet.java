package servletPackage;

import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
public class LogoutServlet extends HttpServlet {  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                                throws ServletException, IOException {  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
           // request.getRequestDispatcher("Login.html").include(request, response);  
              
            HttpSession session=request.getSession();  
            session.invalidate();  
             
            response.sendRedirect("Register.html");
            
           // out.print("<center><b>You are successfully logged out!</b></center>");  
              
            out.close();  
    }  
}  