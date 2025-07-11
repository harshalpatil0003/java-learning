package Assignment4;

import java.util.Iterator;

public class MaxElement {

	public static void main(String[] args) {
		int[] arr= {-1,2,5,8,13,45,7};
		System.out.println(largeElement(arr));
	}
	public static int largeElement(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
