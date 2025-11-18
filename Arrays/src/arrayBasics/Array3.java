package arrayBasics;

import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		
		//another way of creating arrays
		int[] arr= {2,4,6,8,10,12,14,16,18,20};
		
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
