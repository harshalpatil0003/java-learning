package Assignment5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class AddElementAtSpecificPosition {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10};
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter index: ");
		int index= sc.nextInt();
		System.out.print("Enter Element: ");
		int ele=sc.nextInt();
		System.out.println(Arrays.toString(addElement(arr, index, ele)));
		
	}
	
	// adding specific element at specific position
	public static int[] addElement(int[] arr, int index, int ele) {
		
		int[] ans= new int[arr.length+1];
		
		if (index>=0 && index<=arr.length) 
		{
			for (int i = 0; i < ans.length; i++) {
				if (i<index) {
					ans[i]=arr[i];
				}
				else if (i==index) {
					ans[i]=ele;
				}
				else {
					ans[i]=arr[i-1];
				}
			}
		}
		return ans;
	}
}
