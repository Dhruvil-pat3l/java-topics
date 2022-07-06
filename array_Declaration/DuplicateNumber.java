package array_Declaration;

public class DuplicateNumber {

	public static void main (String[] args) {
		int[] arr;
		
		arr = new int[]{1,2,3,2,4,4,5,6,2,3,6,7,8};
		int ln = arr.length,count1=0,count2=0,temp1=0,temp2=0;
		int[] arrDup = new int[ln];
		int[] arrOrg = new int[ln];
		
		for(int i =0; i< ln; i++) { // outer loop for array
			for(int j=0; j<ln ; j++) {  // compare one array element with all others

				if(j!=i) {
					if(arr[i]==arr[j]) { // logic to identify duplicate
						
						for(int k=0; k<count1;k++) {
							if(arr[i]==arrDup[k]) {
								temp2++;
							}
						}
						if(temp2==0) {	// assign array for duplicate value
							arrDup[count1]=arr[i];
							count1++;
							break;
						}
						temp2=0;
					}
				}
				if(arr[i]!=arr[j]) {   // logic to identify Non-duplicate
					temp1++;
				}	
			}
			if(temp1==(ln-1)) {      // assign array for Non-duplicate value
				arrOrg[count2]=arr[i];
				count2++;
			}
			temp1=0;
		}
		System.out.print("Duplicate number: "); // print duplicate array
		for (int i = 0; i < count1; i++) {
			System.out.print( arrDup[i]+",");	
		}
		System.out.print("\n\nNon-Duplicate number: ");	 // print Non-duplicate array
		for (int i = 0; i < count2; i++) {
			System.out.print( arrOrg[i]+",");		
		}
	}	
}