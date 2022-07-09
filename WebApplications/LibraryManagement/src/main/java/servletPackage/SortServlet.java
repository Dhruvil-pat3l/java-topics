package servletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.crypto.Cipher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SortServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        HttpSession session = request.getSession(false);
	        if(session!=null) {
	        	
	        	String book= request.getParameter("book");
	        	String strYear = request.getParameter("year");
	        	String category = request.getParameter("category");
	        	
	        	LinkedList<String> books2011 =new LinkedList<>(); 
	        	LinkedList<String> books2012 =new LinkedList<>(); 
	        	LinkedList<String> books2013 =new LinkedList<>(); 
	        	LinkedList<String> books2014 =new LinkedList<>(); 
	        	
	        	Collections.addAll(books2011, "book11", "book12", "book13");
	        	Collections.addAll(books2012, "book21", "book22", "book23");
	        	Collections.addAll(books2013, "book31", "book32", "book33");
	        	Collections.addAll(books2014, "book41", "book42", "book43");
	        	
	        	////////  category
	        	LinkedHashMap<Integer, LinkedList<String>> record = new LinkedHashMap<>();
	        	record.put(2011,books2011);
	        	record.put(2012,books2012);
	        	record.put(2013,books2013);
	        	record.put(2014,books2014);
	        	
	        	ArrayList<String> alHistory = new ArrayList<>();
	        	ArrayList<String> alMaths = new ArrayList<>();
	        	ArrayList<String> alPhysics = new ArrayList<>();
	        	
	        	Collections.addAll(alHistory, "bk11", "bk12", "bk13");
	        	Collections.addAll(alMaths, "bk21", "bk22", "bk23");
	        	Collections.addAll(alPhysics, "bk31", "bk32", "bk33");
	        	
	        	LinkedHashMap<String, ArrayList<String>> bookCategory = new LinkedHashMap<>();
	        	bookCategory.put("History",alHistory);
	        	bookCategory.put("Maths",alMaths);
	        	bookCategory.put("Physics",alPhysics);
	        	
	        	
	        	String name= (String) session.getAttribute("name");
	        	out.print("<center><br/>Hello <b>"+name +"</b>, Welcome to home Page."
	        			+"<br/><a href=\"LogoutServlet\">Logout</a></center>");
	        	
	        	request.getRequestDispatcher("findRecord.html").include(request,response);
	        	
	        	if(strYear!=null) {

	        		Integer year= Integer.valueOf(strYear);
	        		
	        		if(record.get(year)==null) {
	        			out.println("<center><br/>Record not found.</center>");
	        		}
	        		else {
	        			out.println("<center><br/>Books of year <b>"+year+"</b> are : "+record.get(year)+"</center>");
	        		}
	        	}
	        	
	        	if(book!=null) {
	        		int temp =0;
		        	for(Map.Entry<Integer, LinkedList<String>> val : record.entrySet()) {
		        		
		        		Integer yr = val.getKey();
		        		LinkedList<String> ll= val.getValue();
		        		
		        		for(int i=0; i<ll.size(); i++) {
		        			if((ll.get(i)).equals(book)) {		        				
		        				out.println("<center><br/>Year of <b>"+book+"</b> is : <b>"+yr+"</b></center>");
		        				temp++;
		        				break;
		        			}
		        		}
		        	}
		        	if(temp==0) {
	        			out.println("<center><br/>Record not found.</center>");
	        		}
	        	}

	        	////category
	        	if(category!=null) {
	        	//	out.println("<center><br/>"+category+"</center>");
	        		if(bookCategory.get(category)!=null) {
	        			ArrayList<String> al = bookCategory.get(category);
	        			out.println("<center><br/>Books of <b>"+category+" :</b></center>");
	        			for(int i=0; i<al.size(); i++) {
	        		/**  */		try {
	        					 Signature sign = Signature.getInstance("SHA256withRSA");
	        				      KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
	        				      keyPairGen.initialize(2048);
	        				      KeyPair pair = keyPairGen.generateKeyPair();      
	        				      Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
	        				      cipher.init(Cipher.ENCRYPT_MODE, pair.getPublic());
	        				      byte[] input = (al.get(i)).getBytes();	  
	        				      cipher.update(input);
	        				      byte[] cipherText = cipher.doFinal();	
	        				      String str = new String(cipherText, "UTF8");
								out.print("<center><br/><b>("+(i+1)+")</b> "+ str +" </center>");
							} catch (Exception e) {
								e.printStackTrace();
							}	
		        			//  out.print("<center><br/>("+(i+1)+") "+(al.get(i)).hashCode() +" </center>");	
		        		}
		        	}
	        		else {
	        			out.println("<center><br/>Record not found.</center>");	
	        		}	
	        	}
	        }
	        else {
	           request.getRequestDispatcher("HomeServlet").include(request,response);
	        }
	        out.close();		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
	
		
}
