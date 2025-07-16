package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {-1,9,23,0,-8,6,-89};
		System.out.println(Arrays.toString(bubbleSort(arr)));
		
	}
	
	// Bubble Sort 
	// Time Complexity: O(n^2)
	public static int[] bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
