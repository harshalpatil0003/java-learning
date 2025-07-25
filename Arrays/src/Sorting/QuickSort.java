package Sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {10,90,0,5,-8,6,-4,80,5,20};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr, int start, int end) {
			if (start<end) {
				
				int pos=partition(arr, start, end);
				quickSort(arr, start, pos-1);
				quickSort(arr, pos+1, end);
			}
	}
	public static int partition(int[] arr, int start, int end) {
		int ref=arr[start];
		int i=start, j=end;
		while (i<j) {
			while (i<=end && arr[i]<=ref) {
				i++;
			}
			while (j>start && arr[j]>=ref) {
				j--;
			}
			if (i<j) {
				swap(arr, i, j);
			}
		}
		swap(arr, start, j);
		return j;
		
	}
	public static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
