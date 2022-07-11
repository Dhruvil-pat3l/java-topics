package servletPackage;
import java.io.IOException;  
import java.io.PrintWriter;
import java.util.LinkedHashMap;

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
        	out.print("<center><br/>Hello <b>"+name +"</b>, Welcome to home Page."
        			+"<br/><a href=\"LogoutServlet\">Logout</a></center>");
        
        	request.getRequestDispatcher("StudentForm.html").include(request,response);
        	
        	String fn = request.getParameter("FN");
        	String ln = request.getParameter("LN");
        	String age = request.getParameter("age");
        	String address = request.getParameter("address");
        	
        	
        	if(fn!=null && ln!=null && age!=null && address!=null ) {
        	
        		LinkedHashMap<Integer, LinkedHashMap<String,String>> localRecord =
        		 (LinkedHashMap<Integer, LinkedHashMap<String, String>>) session.getAttribute("record");
        		LinkedHashMap<String,String> detail = new LinkedHashMap<>();
        		
        		int rno = localRecord.size() + 1 ;
        		detail.put("FN", fn);
        		detail.put("LN", ln);
        		detail.put("age", age);
        		detail.put("address", address);
        		
        		localRecord.put(rno,detail);		
        		session.setAttribute("record", localRecord);
        		out.print("<center><br/>Details saved <b>Successfully </b>with Reg. No : "+rno+"</center>");
        	}
        	out.print("<center><br/><br/><p>Go to <a href='SortServlet'>Sorting Page.</a></p> </b></center>");
        }
        else {
        	request.getRequestDispatcher("Login.html").include(request,response);
        }
        out.close();   
    }  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	doGet(request,response);	
    }
} 