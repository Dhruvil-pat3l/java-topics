package timeDate;
import java.util.Date;  
import java.time.Instant;  

public class DateClass {
	public static void main(String[] args) { 
	
	Date date=new Date();  
	System.out.println(date);  
	
	Date d1=new Date(2018,9,21);  
	Date d2=new Date(2017,3,10);  
	System.out.println("\nDate 'd1' is after Date 'd2' : "+d1.after(d2));
	
	System.out.println("\nClone of your Date 'date' : "+date.clone());  
	
	System.out.println("\nComparison value is : "+d1.compareTo(d2));  
	
	System.out.println("\nDate 'd1' equals Date 'd2' : "+d1.equals(d2));  
	
    Instant i= Instant.now();  
    System.out.println("\nDate  : "+date.from(i));  
	
    System.out.println("\nGet Time : "+date.getTime());
	
	}
}