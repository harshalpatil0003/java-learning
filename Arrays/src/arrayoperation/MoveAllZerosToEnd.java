package arrayoperation;

import java.util.Arrays;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		int[] arr= {0,1,0,3,0,2,8,9};
		System.out.println(Arrays.toString(moveAllZeros(arr)));
		
	}
	public static int[] moveAllZeros(int[] arr) {
		int  j=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}
		}
		while (j<arr.length) {
			arr[j]=0;
			j++;
		}
	
		return arr;
	}
}
