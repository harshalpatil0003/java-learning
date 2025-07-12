package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class RemovingElement {
	
	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10,12};
		
		System.out.print("Enter Element: ");
		Scanner sc= new Scanner(System.in);
		int ele=sc.nextInt();
		System.out.println(Arrays.toString(removeElement(arr, ele)));
		
	}
	
	// removing element from array
	public static int[] removeElement(int[] arr, int ele) {
		
		int i=0;
		for (i = 0; i < arr.length; i++) 
		{
			if(arr[i]==ele)
			break;
		}
		
		if (i<arr.length) {
			
			int[] ans=new int[arr.length-1];
			
			for (int j = 0; j < ans.length; j++) {
				if (j<i) {
					ans[j]=arr[j];
				}
				else if(i>j) {
					ans[j-1]=arr[j];
				}
			}
			return ans;
			
		}
		return arr;
	}
}
