package arrayoperation;

import java.util.Arrays;

public class ReverseArray{
	
	public static void main(String[] args) {
		
		int[] arr= {2,4,6,8,10};
		System.out.println(Arrays.toString(reverse(arr)));
	}
	
	public static int[] reverse(int[] arr) {
		
		int[] ans=new int[arr.length];
		for (int i = 0,j=arr.length-1; i <ans.length; i++) {
			ans[i]=arr[j];
			j--;
		}
		return ans;
	}
}