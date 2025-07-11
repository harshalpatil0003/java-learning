package Assignment3;

import java.util.Arrays;

public class MissingElementFromSeries {

	public static void main(String[] args) {
		// 14 is missing
		int[] arr= {2,4,6,8,10,12,16};
		
		//4 is missing
		int[] arr2= {1,2,3,5};
		minElement2(arr2);
		//System.out.println(missedElement(arr));
	}
	public static int missedElement(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			if((i+1)*2 != arr[i]) {
				return (i+1)*2;
			}
		}
		return 0;
	}
	
	public static void minElement2(int[] arr2) {
		
		// Logic 2
		int max=Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < arr2.length; i++) {
			sum+=arr2[i];
			if (arr2[i]>max) {
				max=arr2[i];
			}
		}
		
		System.out.println(sumOfNaturalElements(max)-sum);
	}
	
	public static int sumOfNaturalElements(int num) {
		// method to sum of n Natural numbers.
		// formula: n(n+1)/2.
		return (num*(num+1)/2);
	}
}
