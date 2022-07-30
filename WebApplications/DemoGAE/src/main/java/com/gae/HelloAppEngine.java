package com.gae;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.SortDirection;


@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/message"}
)
public class HelloAppEngine extends HttpServlet {

	 private List<String> messages = new ArrayList<>();

	  @Override
	  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    response.setContentType("text/html;");
	   
	    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	    Query query = new Query("Message");
	    PreparedQuery results = datastore.prepare(query);
	    for (Entity entity : results.asIterable()) {
	      String message = (String) entity.getProperty("text");
	      response.getOutputStream().println("<li>" + message + "</li>");
	    }
	    
	  }
	  
	  @Override
	  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    String text = request.getParameter("message");

	    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	    Entity messageEntity = new Entity("Message");
	    messageEntity.setProperty("text", text);
	    datastore.put(messageEntity);
	   
	    doGet( request, response);
	  }
}