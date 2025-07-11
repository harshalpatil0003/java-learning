package Assignment3;

import java.util.Arrays;

public class MissingElementFromSeries {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10,12,16};
		System.out.println(missedElement(arr));
	}
	public static int missedElement(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			if((i+1)*2 != arr[i]) {
				return (i+1)*2;
			}
		}
		return 0;
	}
}
