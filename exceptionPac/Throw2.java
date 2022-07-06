package exceptionPac;


class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {  
        super(str);  
    }  
}  
public class Throw2  
{  
    public static void main(String args[])  
    {  
        try  
        {  
        	throw new UserDefinedException("This is user-defined exception");  
        }  
        catch (UserDefinedException ue)  
        {  
            System.out.println("Caught the exception");  
             System.out.println(ue.getMessage());  
        }  
    }  
}   