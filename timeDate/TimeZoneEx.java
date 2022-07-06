package timeDate;
import java.util.TimeZone;
import java.util.Calendar;

public class TimeZoneEx {  
   public static void main( String args[] ){      
	   
	   TimeZone zone = TimeZone.getTimeZone("Asia/Kolkata");   
	   
	   System.out.println("TimeZone: " +zone.getOffset(Calendar.ZONE_OFFSET));  
	   
	   System.out.println("\nTime zone: "+ zone.getDisplayName());  
	   
	   System.out.println("\nID : " + zone.getID()); 
	   
	   zone.setID("GMT + 07:01"); 
	   System.out.println("\nTime zone ID is: " + zone.getID());  
	   
   }      
}  