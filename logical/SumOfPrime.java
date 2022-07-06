package logical;
import java.util.Scanner;

class Prime1{
	
	int count=0;
	int[] arrPrime;
	
	void findPrime(int num){
		System.out.println();
		int i,j;
		arrPrime = new int[num];
		
		for (i=1; i<=num; i++) {
			int k=0;
			for(j=1; j<=i;j++){
				if(i%j==0) {
				k=k+1;
				}
			}
			if(k==2 && k!=0 && k!=1) {
				arrPrime[count]=i;
				count++;
			}
		}
	}
	
	boolean isPrime(int sum){
		boolean x=false;
		int k=0;
		
		for (int i=1; i<=sum; i++) {
			if(sum%i==0) {
				k=k+1;
			}
		}
		
		if(k==2 && k!=0 && k!=1) {
			x=true;
		}
		
	return x;
	}
}

public class SumOfPrime // extends Prime_demo 
{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		
		int num = sc.nextInt();
		sc.close();
		
		Prime1 objPrime = new Prime1();
	//	Prime pm2 = new Prime();
		objPrime.findPrime(num);
		
		int subTotal=0,temp=0,max=0,total=0;
		
		for(int i=0; i< objPrime.count; i++) {
			int sum=0;
			
			for(int j=i; j< objPrime.count; j++) {				
				sum = sum + objPrime.arrPrime[j];	
				temp++;
				if((sum<=num) && objPrime.isPrime(sum)) {
					subTotal =sum;
					if(max<temp) {
						max=temp;
						total=subTotal;						
					//	pm2.findPrime(objPrime.arrPrime[i],objPrime.arrPrime[j]);
					}
				}
			}
			temp=0;
		}
		System.out.println("prime : "+total +",  Total Consecutive primes : " +max +"\n");		
	}
}

/*
Enter number : 100
prime : 41,  Total Consecutive primes : 6

Enter number : 1000
prime : 953,  Total Consecutive primes : 21

Enter number : 10000
prime : 9521,  Total Consecutive primes : 65

Enter number : 100000
prime : 92951,  Total Consecutive primes : 183


*/
