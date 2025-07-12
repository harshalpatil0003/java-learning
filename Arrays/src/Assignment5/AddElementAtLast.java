package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementAtLast {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8};
		
		System.out.print("Enter Element to add: ");
		int ele= new Scanner(System.in).nextInt();
		System.out.println(Arrays.toString(addElementToArray(arr,ele)));
		//addElementToArray(arr,ele);	
	}
	// adding element at last of array
	public static int[] addElementToArray(int[] arr, int ele) {
		
		int[] ans= new int[arr.length+1];
		
		for (int i = 0; i < ans.length; i++) {
			if (i<arr.length) {
				ans[i]=arr[i];
			}
			else if (i>=arr.length) {
				ans[i]=ele;
			} 
		}
		return ans;
	}
}
