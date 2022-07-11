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
import java.util.TreeMap;

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
	        	request.getRequestDispatcher("Fatching.html").include(request, response);
	        	
	        	LinkedHashMap<Integer, LinkedHashMap<String,String>> fatchedRecord =
	        	(LinkedHashMap<Integer, LinkedHashMap<String, String>>) session.getAttribute("record");
	        	
	        	if(fatchedRecord.size()>0) {
	        	
	        		String type = request.getParameter("SortType");
	        		if(type!=null) {
	        			
	        			out.print("<center><br/><table style=' font-family: arial, sans-serif; border-collapse: collapse; text-align: left; width: 100%;'>"
	        					+ "  <tr>"
	        					+ "    <th>Reg. No</th>"
	        					+ "    <th>First Name</th>"
	        					+ "    <th>Last Name</th>"
	        					+ "    <th>Age</th>"
	        					+ "    <th>Address</th>"
	        					+ "  </tr>");
	        			
	        			if(type.equals("Rno")) {
	        				out.print("<center>Sort by : <b>Registration Number</b><br/><br/></center>");
	        				for(Map.Entry<Integer, LinkedHashMap<String,String>> outerMap : fatchedRecord.entrySet()) {
	        					int rno = outerMap.getKey();
	        					
	        					LinkedHashMap<String,String> innerMap = outerMap.getValue();
        						String fn = innerMap.get("FN");
        						String ln = innerMap.get("LN");
        						String age = innerMap.get("age");
        						String address = innerMap.get("address");
        						
        						out.print("<center><tr>"
        								+ "    <td>"+rno +"</td>"
        								+ "    <td>"+fn +"</td>"
        								+ "    <td>"+ln +"</td>"
        								+ "    <td>"+age +"</td>"
        								+ "    <td>"+address +"</td>"
        								+ "  </tr>");		
	        				}	
	        			}
	        			if(type.equals("FN")) {
	        				out.print("<center>Sort by : <b>First Name</b><br/><br/></center>");
	        				TreeMap<String, LinkedHashMap<String,String>> firstName = new TreeMap<>();
	        				
	        				for(Map.Entry<Integer, LinkedHashMap<String,String>> outerMap : fatchedRecord.entrySet()) {
	        					int rno = outerMap.getKey();
	        					LinkedHashMap<String,String> innerMap = outerMap.getValue();
        						String fn = innerMap.get("FN");
        						String ln = innerMap.get("LN");
        						String age = innerMap.get("age");
        						String address = innerMap.get("address");
        						
        						LinkedHashMap<String,String> firstNameInner = new LinkedHashMap<>();
        						
        						firstNameInner.put("Rno", Integer.toString(rno));
        						firstNameInner.put("LN", ln);
        						firstNameInner.put("age", age);
        						firstNameInner.put("address", address);
        						
        						firstName.put(fn, firstNameInner);
	        				}
	        				
	        				for(Map.Entry<String, LinkedHashMap<String,String>> outerMap : firstName.entrySet()) {	        					
	        					String fn= outerMap.getKey();
	        					
	        					LinkedHashMap<String,String> innerMap = outerMap.getValue();
        						String rno = innerMap.get("Rno");
        						String ln = innerMap.get("LN");
        						String age = innerMap.get("age");
        						String address = innerMap.get("address");
        						
        						out.print("<center><tr>"
        								+ "    <td>"+rno +"</td>"
        								+ "    <td>"+fn +"</td>"
        								+ "    <td>"+ln +"</td>"
        								+ "    <td>"+age +"</td>"
        								+ "    <td>"+address +"</td>"
        								+ "  </tr>");		
	        				}
	        				
	        			}
	        			if(type.equals("Special")) {
	        				out.print("<center>Sort by : <b>Special Sorting</b><br/><br/></center>");
	        				TreeMap<String, LinkedHashMap<String,String>> lastName = new TreeMap<>();
	        				
	        				for(Map.Entry<Integer, LinkedHashMap<String,String>> outerMap : fatchedRecord.entrySet()) {
	        					int rno = outerMap.getKey();
	        					LinkedHashMap<String,String> innerMap = outerMap.getValue();
        						String fn = innerMap.get("FN");
        						String ln = innerMap.get("LN");
        						String age = innerMap.get("age");
        						String address = innerMap.get("address");
        						
        						StringBuffer specialLN ;
        						
        						if(ln.length()==1 || ln.length()==2) {
        							specialLN = new StringBuffer(ln);
        						}
        						else {
            						specialLN = new StringBuffer("");
	        						for(int i = ln.length()-2 ; i<ln.length(); i++) {
	        							specialLN.append(ln.charAt(i));
	        							if(i==(ln.length()-1)) {
	        								i=-1;
	        							}
	        							if(i==(ln.length()-3)) {
	        								break;
	        							}
	        						}
        						}	
        						
        						LinkedHashMap<String,String> lastNameInner = new LinkedHashMap<>();
        						
        						lastNameInner.put("Rno", Integer.toString(rno));
        						lastNameInner.put("FN", fn);
        						lastNameInner.put("LN", ln);
        						lastNameInner.put("age", age);
        						lastNameInner.put("address", address);
        						
        						lastName.put(specialLN.toString(), lastNameInner);
	        				}
	        				
	        				for(Map.Entry<String, LinkedHashMap<String,String>> outerMap : lastName.entrySet()) {	        					
	        					
	        					LinkedHashMap<String,String> innerMap = outerMap.getValue();
        						String rno = innerMap.get("Rno");
        						String fn = innerMap.get("FN");
        						String ln = innerMap.get("LN");
        						String age = innerMap.get("age");
        						String address = innerMap.get("address");
        						
        						out.print("<center><tr>"
        								+ "    <td>"+rno +"</td>"
        								+ "    <td>"+fn +"</td>"
        								+ "    <td>"+ln +"</td>"
        								+ "    <td>"+age +"</td>"
        								+ "    <td>"+address +"</td>"
        								+ "  </tr>");		
	        				}
	        			}
	        			out.print("</table></center>");
	        			
	        		}	
	        	}
	        	else {
	        		out.print("<center><br/><br/>No Student data is inserted.</center>");
	        	}
	        	
	        	out.print("<center><br/><br/><br/><p>Go to <a href='HomeServlet'>Registration Form.</a></p><br/><a href='LogoutServlet'>Logout</a></center>");
	        	
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
