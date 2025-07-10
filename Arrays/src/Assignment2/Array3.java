package Assignment2;

import java.util.Arrays;
import java.util.Iterator;

public class Array3 {

	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50,60};
		int[] arr2= {70,80,90,100};
		
		System.out.println(Arrays.toString(reverseArray(arr1,arr2)));
	}
	
	public static int[] reverseArray(int[] arr1, int[] arr2) {
		
		int[] ans= new int[arr1.length+arr2.length];

		for (int i = 0,j=arr1.length-1; i < ans.length; i++) {
			if (i<arr1.length) {
				ans[i]=arr1[j];
				j--;
			}
			else {
				ans[i]=arr2[i-arr1.length];
			}
		}
		return ans;
	}
}