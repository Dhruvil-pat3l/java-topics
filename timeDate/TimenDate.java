package timeDate;
import java.time.*;

import java.time.format.DateTimeFormatter;   


public class TimenDate {    
	public static void main(String[] args) { 
		
	    LocalDate date = LocalDate.now();    
	    LocalDate yesterday = date.minusDays(1);    
	    LocalDate tomorrow = yesterday.plusDays(2); 
	    
	    System.out.println("Today date: "+date);    
	    System.out.println("Yesterday date: "+yesterday);    
	    System.out.println("Tomorrow date: "+tomorrow);   
	    
	    System.out.println(date.isLeapYear());   
	    
	    LocalDateTime datetime = date.atTime(11,59,01);      
	    System.out.println(datetime);
	    
	    LocalTime time = LocalTime.now();  
	    System.out.println(time);
	    
	    LocalTime time1 = LocalTime.of(21,01,29);  
	    System.out.println(time1); 
	    
	    LocalTime time2=time1.minusHours(2);  
	    LocalTime time3=time2.minusMinutes(34);  
	    System.out.println(time3); 
	    
	    LocalTime time4=time1.plusHours(4);  
	    LocalTime time5=time4.plusMinutes(18);  
	    System.out.println(time5);  
	    
	    ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("Asia/Tokyo");
	    
	    LocalTime tim1 = LocalTime.now(zone1);  
	    System.out.println("India Time Zone: "+tim1);  
	    LocalTime tim2 = LocalTime.now(zone2);  
	    System.out.println("Japan Time Zone: "+tim2);  
	    
	    System.out.println("Before Formatting: " + datetime);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = datetime.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
	   
  }    
	
	
}   