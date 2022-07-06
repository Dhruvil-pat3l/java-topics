package logical;
import java.util.*;

class Prime{
	void findPrime(int a, int b){
		System.out.println();
		//System.out.print("\nPrime number(s) b/w range of [" +a +"," +b +"] is ");
		int i,j;
		if(a>=0 && b>=0) {
			for (i=a; i<=b; i++) {
				int k=0;
				for(j=1; j<=i;j++){
					if(i%j==0) {
					k=k+1;
					}
				}
				if(k==2 && k!=0 && k!=1) {
					System.out.print(i +", ");
				}
			}
		}
		else {
			for (i=a; i<=b; i++) {
				int k=0;
				if(i<0) {
					for(j=-1; j>=i;j--){
						if(i%j==0) {
							k=k+1;
							}
					}
				}
				else if(i>0) {
					for(j=1; j<=i;j++){
						if(i%j==0) {
							k=k+1;
						}
					}
				}
				
				if(k==2 && k!=0 && k!=1) {
					System.out.print(i +", ");
				}
			}
		}	
	//	System.out.print("\b\b.");
	}
}

class Prime_demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range of b/w two number.\n");
		System.out.print("Enter 1st number of range : ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2st number of range : ");
		int n2 = sc.nextInt();
		sc.close();
		Prime pm = new Prime();
		
		if(n1<=n2) {
			pm.findPrime(n1,n2);
		}
		else {
			pm.findPrime(n2,n1);
		}
		
	}
}
