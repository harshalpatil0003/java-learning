package Assignment2;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {70,80,90,100,110,120,130};
		System.out.println(Arrays.toString(zigZag(arr1,arr2)));
		
	}
	public static int[] zigZag(int[] arr1, int[] arr2) {
		
		int[] ans= new int[arr1.length+arr2.length];
		
		for (int i = 0,j=0,k=0; i < ans.length; i++) {
			
			if (i%2==0 && j<arr1.length) {
				ans[i]=arr1[j];
				j++;
			} 
			else if(k<arr2.length) {
				ans[i]=arr2[k];
				k++;
			}	
			else {
				ans[i]=arr1[j];
				j++;
			}
		}
		return ans;
	}
}
