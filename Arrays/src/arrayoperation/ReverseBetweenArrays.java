package arrayoperation;

import java.util.Arrays;

public class ReverseBetweenArrays {

public static void main(String[] args) {
	int[] arr= {2,4,6,8,10};
	
	int[] ans=reverse(arr);
	System.out.println(Arrays.toString(ans));
}
public static int[] reverse(int[] arr) {
	
	int[] rev= new int[arr.length];
	
	for (int i = 0; i < arr.length; i++) {
		rev[arr.length-1-i]=arr[i];
	}
	return rev;
	
	
}
}
