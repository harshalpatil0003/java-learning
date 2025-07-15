package Assignment6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveOccuranceOfElement {

	public static void main(String[] args) {
		int[] arr= {2,1,3,2,5,6,4,2};
		System.out.print("Enter Element: ");
		int ele= new Scanner(System.in).nextInt();
		System.out.println(Arrays.toString(removeFrequant(arr, ele)));
		
	}
	// this method removes inupt occurant elements and return array of rest of all elements. 
	public static int[] removeFrequant(int[] arr, int ele) {
		int ct=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==ele) {
				ct++;
			}
		}
		if (ct>0) {
			int[] ans= new int[arr.length-ct];
			
			for (int i = 0,j=0; i < arr.length; i++) {
				if (arr[i]!=ele) {
					ans[j]=arr[i];
					j++;
				}
			}
			return ans;
		}
		if (ct==0) {
			System.out.println("Element not found!");
		}
		return null;
	}
}
