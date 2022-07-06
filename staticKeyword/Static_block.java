package staticKeyword;

public class Static_block { 
    static{  
        System.out.println("STATIC BLOCK 1");  
    }  
    public static void main(String args[]){   
        System.out.println("MAIN METHOD");
    }  
    static{  
        System.out.println("STATIC BLOCK 2");  
    } 
} 
