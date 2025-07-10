package arrayoperation;

import java.util.Arrays;

public class ReverseArray{
	
	public static void main(String[] args) {
		
		int[] arr= {2,4,6,8,10};
		System.out.println(Arrays.toString(reverse(arr)));
	}
	
	public static int[] reverse(int[] arr) {
		
		int[] ans=new int[arr.length];
		for (int i = arr.length-1; i >=0; i--) {
			//ans[i]=(arr[i]);
			System.out.println(arr[i]);
		}
		return ans;
	}
}