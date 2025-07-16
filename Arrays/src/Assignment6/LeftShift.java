package Assignment6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class LeftShift {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		System.out.print("Enter No of rotaion: ");
		int n= new Scanner(System.in).nextInt();
		
		for (int i = 0; i <n; i++) {
			if (i!=0) {
				leftShift(arr);
			}
			
			
		}
		System.out.println(Arrays.toString(leftShift(arr)));
		
	}
	// rotate  Array Anticlockwise
	public static int[] leftShift(int[] arr) {
		int[] ans= new int[arr.length];
		for (int i = 0; i < arr.length-1; i++) {
			int temp=arr[i+1];
			arr[i+1]=arr[i];
		 	arr[i]=temp;
		}
		return arr;
	}
}
