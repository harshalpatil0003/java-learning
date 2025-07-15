package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class RightShift {

	public static void main(String[] args) {
			int[] arr= {10,20,30,40,50,60};
		System.out.print("Enter No of rotaion: ");
		int n= new Scanner(System.in).nextInt();
			
		for (int i = 0; i <n; i++) {
			rightShift(arr);
			}
		System.out.println(Arrays.toString(rightShift(arr)));
	}
	// rotate  Array Anticlockwise
	public static int[] rightShift(int[] arr) {
		int[] ans= new int[arr.length];
		for (int i = arr.length-1; i >0; i--) {
			int temp=arr[i-1];
		 arr[i-1]=arr[i];
		 arr[i]=temp;
		}
		return arr;
	}
}
