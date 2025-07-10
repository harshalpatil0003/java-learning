package arrayoperation;

import java.util.Arrays;
import java.util.Iterator;

public class MergeArrays {

	public static void main(String[] args) {
		int[] arr1={10,20,30,40,50,60};
		int[] arr2= {70,80,90,100};
		System.out.println(Arrays.toString(merge1(arr1,arr2)));
		//System.out.println(Arrays.toString(merge2(arr1,arr2)));
	}
	
	public static int[] merge1(int[] arr1, int[] arr2) {
		
		int[] ans= new int[arr1.length+arr2.length];
		
		int memory=0;
		for (int i = 0; i < arr1.length; i++,memory++) {
			ans[memory]=arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++, memory++) {
			ans[memory]=arr2[i];
		}
		return ans;
	}
	
	public static int[] merge2(int[] arr1,int[] arr2) {
		
		int[] ans=new int[arr1.length+arr2.length];
		
		for (int i = 0; i < ans.length; i++) {
			if(i<arr1.length) {
				ans[i]=arr1[i];
			}
			else {
				ans[i]=arr2[i-arr1.length];
			}
		}
		return ans;
	}
}
