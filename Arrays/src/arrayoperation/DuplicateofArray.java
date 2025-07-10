package arrayoperation;

import java.util.Arrays;

public class DuplicateofArray {

	// Copying elements from one array to other.
	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10};
		
		// another waywithin main method
//		int[] dup= new int[arr.length];
//		
//		for (int i = 0; i < dup.length; i++) {
//			dup[i]=arr[i];
//		}
//		for (int i = 0; i < dup.length; i++) {
//			System.out.println(dup[i]);
//		}
		
		
		int[] ans=duplicate(arr);
		System.out.println(Arrays.toString(ans));
		
	}
	
	public static int[] duplicate(int[] arr) {

		int[] dup= new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			dup[i]=arr[i];
		}
		 return dup;
	}
}
