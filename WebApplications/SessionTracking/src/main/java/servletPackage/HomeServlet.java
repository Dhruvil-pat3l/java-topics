package servletPackage;
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

public class HomeServlet extends HttpServlet {  
     
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    					throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        Cookie ck[] = request.getCookies();
        if( (ck!=null) && (ck.length!=0) ) {
        	String name= ck[0].getValue();
        	String password=ck[1].getValue();
		    out.print("<center><br/>Hello <b>"+name +"</b>, Welcome to home Page<br/><br/>"
        			+ "Submit to see hidden field : "
        				+ "<form action='HomeServlet'>"
        				 + "<input type='hidden' name='hdn' value="+password+" />"
        				   + "<input type='submit' value=submit />"
        				   + "</form>"
        				   + "<br/> Click <a href='HomeServlet?rewrite="+password+"'>here</a> for URL Rewriting"
        				   	+ "<br/><br/><a href=\"LogoutServlet\">Logout</a> </center>");
		    
		    String hiddenVar = request.getParameter("hdn");
		    String reWrite = request.getParameter("rewrite");
		    
		    if(hiddenVar!=null) {
		    	out.print("<center><br/>Hidden Field Value : "+hiddenVar+"</center>");
		    }
		    if(reWrite!=null) {
		    	out.print("<center><br/>Value passed in URL Rewriting is : "+reWrite+"</center>");
		    }
        }
        else {
        //	out.print("<center><br/>For Login, Enter correct details.</center>");
        	request.getRequestDispatcher("Login.html").include(request,response);
        }
        out.close();
        
    }  
}  