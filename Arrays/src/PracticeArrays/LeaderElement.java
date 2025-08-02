package PracticeArrays;

import java.util.Iterator;

public class LeaderElement {

	public static void main(String[] args) {
		int [] arr= {16,17,4,3,5,2};
		leader(arr);
	}
	public static void leader(int[] arr) {
		
		for (int i = arr.length-1;i>0; i--) {
			if (arr[i]>arr[i-1]) {
				
				System.out.println(arr[i]);
			}
		}
	}
}
