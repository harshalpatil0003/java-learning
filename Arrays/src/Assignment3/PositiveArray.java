package Assignment3;

import java.util.Arrays;
public class PositiveArray {

	public static void main(String[] args) {
		int[] arr= {-1,-2,0,-4,-5,6};
		System.out.println(Arrays.toString(negativeToPositive(arr)));
	}
	public static int[] negativeToPositive(int[] arr) {
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<0) {
				arr[i]*=-1;
			}
		}
		return arr;
	}
}