package arrayoperation;

import java.util.Arrays;

public class ReverseHalfarray {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,3,2,1};
		int[] ans=halfReverse(arr);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] halfReverse(int[] arr) {
		
		int[] dup= new int[arr.length];
		
		for (int i = arr.length-1; i >=(arr.length)/2 ; i--) {
			System.out.println(dup[i]=arr[i]);
		}
		for (int j = 0; j < (dup.length)/2; j++) {
			System.out.println(dup[j]=arr[j]);
		}
		System.out.println("--------------");
		
		
		for (int i = 0; i < (dup.length)/2; i++) {
			System.out.println(arr[i]);
		}
		
		for (int i = dup.length-1; i >= dup.length/2; i--) {
			System.out.println(arr[i]);
		}
		return dup;
	}
}
