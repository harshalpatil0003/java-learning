package Assignment3;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseSameArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(reverseSameArray(arr)));
	}
	public static int[] reverseSameArray(int[] arr) {
		
		for (int i =0,j=arr.length-1; i <arr.length/2; i++) {
			
			 int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		return arr;
	}
	
}
