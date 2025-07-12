package Assignment3;

import java.util.Arrays;
import java.util.Iterator;

public class SeperatePositiveNegative {

	public static void main(String[] args) {
		int[] arr= {9,0,-3,1,-3,2,-2,-1,3,4,5,-7,6,0,-97,1,5,-69,4,-36,17,-100};
		
//		for (int i = 0; i < arr.length; i++) {
//			seperate(arr);
//		}
		//System.out.println(Arrays.toString(seperate(arr)));
		System.out.println(Arrays.toString(seperate2(arr)));
	}
	public static int[] seperate(int[] arr) {
		
		for (int i = 0,j=1; i < arr.length-1; i++,j++) {
		
			if (arr[i]>arr[j]) {
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return arr;
	}
	
	// Another logic to find missing element
	
	public static int[] seperate2(int[] arr){
		
		int i=0, j=arr.length-1;
		
		while(i<j) {
			
			while(arr[i]<0) {
				i++;
			}
			while(arr[j]>0) {
				j--;
			}
			if (i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		return arr;
	}
}
