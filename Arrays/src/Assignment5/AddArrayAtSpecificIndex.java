package Assignment5;

import java.util.Arrays;

public class AddArrayAtSpecificIndex {

	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {100,200,300};
		
		System.out.println(Arrays.toString(addArrayAtIndex(arr1, arr2, 3)));
		
		
	}
	public static int[] addArrayAtIndex(int[] arr1, int[] arr2, int index) {
		
		int[] ans= new int[arr1.length+arr2.length];
		
		if (index>=0 && index<=arr1.length) {
			int i=0;
			while( i <= ans.length ) {
				if (i<index) {
					ans[i]=arr1[i];
	
				}
				else if(i==index) {
					for (int j = 0; j < arr2.length; j++) {
						ans[i]=arr2[j];
						i++;
					}
				}
				else{
					ans[i-1]=arr1[i-arr1.length+1];
				}
				i++;
			}
		}
		return ans;
	}
}