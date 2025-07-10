package arrayoperation;

public class CountOfPrimeNums {

public static void main(String[] args) {
	
	int[] arr= {0,1,2,3,5,7,11,13,17,17,2};
	primeCount(arr);
}
public static void primeCount(int[] arr) {
	int count=0;
	
	
	for (int i = 0; i < arr.length; i++) {
		int den=2;
		while(den<arr[i]) {
			
			if (arr[i]%den==0) {
				break;
			}
			den++;
		}
		if (den==arr[i]) 
			count++;
	}

	System.out.println(count);
}
}
