package timeDate;
import java.util.Calendar;  

public class CalenderClass {  
	   public static void main(String[] args) {  
		   
		   Calendar calendarObj = Calendar.getInstance();  
		   
		   System.out.println("The current date : " + calendarObj.getTime());  
		   
		   calendarObj.add(Calendar.DATE, -2);  
		   System.out.println("\n2 days ago: " + calendarObj.getTime());  
		   
		   calendarObj.add(Calendar.MONTH, 3);  
		   System.out.println("\n3 months after: " + calendarObj.getTime());  
		   
		   calendarObj.add(Calendar.YEAR, 1);  
		   System.out.println("\n1 years after: " + calendarObj.getTime());  
		   
		   System.out.println("\nPresent Calendar Year: " + calendarObj.get(Calendar.YEAR)); 
		   
		   System.out.println("\nPresent Calendar Day: " + calendarObj.get(Calendar.DATE));  
		   
		   System.out.println("\nMax days in week: " + calendarObj.getMaximum(Calendar.DAY_OF_WEEK));  
		   
		   System.out.println("\nMax weeks in year: " + calendarObj.getMaximum(Calendar.WEEK_OF_YEAR));  
		   
		   System.out.println("\nMin days in week: " + calendarObj.getMaximum(Calendar.DAY_OF_WEEK));  
		   
		   System.out.println("\nMin weeks in year: " + calendarObj.getMaximum(Calendar.WEEK_OF_YEAR));  
		   
	   }  
}  