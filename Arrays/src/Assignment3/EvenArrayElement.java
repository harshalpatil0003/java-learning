package Assignment3;

import java.util.Arrays;

public class EvenArrayElement {

	public static void main(String[] args) {
		int[] arr={1,3,5,7,9,11,13};
		System.out.println(Arrays.toString(evenArrayElements(arr)));
	}
	
	public static int[] evenArrayElements(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==1) {
				arr[i]+=1;
			}
		}
	return arr;
	}
}
