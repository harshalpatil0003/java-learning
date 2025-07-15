package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class RetainOccuranceRemoveRest{
	public static void main(String[] args) {
		int[] arr= {2,4,2,1,3,5,5,3,1,9,5,8,7,9,4};
		System.out.print("Enter Element: ");
		int ele= new Scanner(System.in).nextInt();
		System.out.println(Arrays.toString(removeOccurance(arr, ele)));
		
	}
	
	// this method return array of occurant element
	public static int[] removeOccurance(int[] arr ,int ele) {
		
		int ct=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==ele) {
				ct++;
			}
		}
		
		if (ct>0) {
			int[] ans= new int[ct];
			for (int i = 0, j=0; i < arr.length; i++) {
				if (arr[i]==ele) {
					ans[j]=arr[i];
					j++;
				}
			}
			return ans;
		}
		else if (ct==0) {
			System.out.println("Element not found!");
		}
		return null;
	}

}
