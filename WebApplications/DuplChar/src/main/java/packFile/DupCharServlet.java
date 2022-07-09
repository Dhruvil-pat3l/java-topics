package packFile;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/URL")
public class DupCharServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	     
	     request.getRequestDispatcher("DuplicateChar.html").include(request, response);
	     
	     String str = (request.getParameter("str")).trim();
	     out.print("<center><br/>In passed String \""+str+"\"<br/></center>");
	     
	     LinkedList<String> list = new LinkedList<>();
	     
	     for(int i=0; i<str.length();i++) {
	    	 list.add( Character.toString(str.charAt(i)) );
	     }
	     
	     int count = 0;
	     for(int i=0; i<list.size();i++){
	    	 int temp=1;
	    	 if(list.get(i)!=null) {
		    	 for(int j = i+1;j<list.size();j++) {
		    		if(list.get(j)!=null) { 
		    			try {
			    		 if( (list.get(i)).equalsIgnoreCase(list.get(j)) ){
			    			 temp++;
			    			 count =1;
			    			 list.set(j,null);
			    		 }
		    			}
		    			catch(Exception e) { System.out.println(e);}	
		    		}	 
		    	 }
	    	 }
	    	 if(temp>1) {
	    		 out.print("<center><br/>'"+list.get(i)+"' occurred "+temp+" times.</center>");
	    	 }
	     }
	     if(count==0) {
    		 out.print("<center><br/>There is <b>no duplicate</b> occurrence in a string.</center>");
    	 }
	     out.close();	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("DuplicateChar.html").include(request, response);
	}
}
