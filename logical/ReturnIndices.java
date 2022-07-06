package logical;
import java.util.Scanner;
public class ReturnIndices {

	public static void main(String[] args) {
		ReturnIndices obj= new ReturnIndices();
		int output[]= obj.check();
		if(output[0]==-1 && output[1]==-1) {
			System.out.println("\nOutput is not possible for given input."); 	
		}
		else {
			System.out.println("\nOutput: ["+output[0]+","+output[1]+"]"); 
		}
	}
	
	int[] check() {
		
		int n,x=0,y=0, target,temp=0;;  	
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the size of Array: ");  	
		n=sc.nextInt();  
		
		int[] arr = new int[n];  
		System.out.println("Enter the elements of the Array: ");  
		
		for(int i=0; i<n; i++)  {    // Array input from user
			arr[i]=sc.nextInt(); 
		} 
		
		System.out.print("Enter the traget value: ");  
		target=sc.nextInt();		// Target value 
		
		sc.close();  
        
        for (int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(target==(arr[i]+arr[j])){		// verifying match for given target
                	x=i;
                	y=j;
                	temp++;
                }
            }
            if(temp==1) {
            	break;
            }
        }
        if(temp==0){			// Invalid case
        	x=y=-1;
        }
	return new int[] {x,y};
	}
}