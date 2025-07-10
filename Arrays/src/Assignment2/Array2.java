package Assignment2;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50,60};
		int[] arr2= {70,80,90,100};
		System.out.println(Arrays.toString(swap(arr1,arr2)));
	}
	
	public static int[] swap(int[] arr1, int[] arr2) {
		
		int[] ans= new int[arr1.length+arr2.length];
		
		for (int i = 0; i < ans.length; i++) {
			if(i<arr2.length)
			{
				ans[i]=arr2[i];
			}
			else {
				ans[i]=arr1[i-arr2.length];
			}
		}
		return ans;
	}
}
