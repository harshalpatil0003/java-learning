package Assignment5;

import java.util.Arrays;
import java.util.Iterator;

public class SliceArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(sliceArray(arr)));
		
	}
	public static int[] sliceArray(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==10 || arr[i]==30 || arr[i]==70) {
				count++;
			}
		}
		int[] ans= new int[count];
		
		int i=0; 
		int memory=0;
		while(i<arr.length) {
		if(arr[i]==10 || arr[i]==30 || arr[i]==70) {
			ans[memory]=arr[i];
			memory++;
		}
		i++;
		}
		return ans;
	}
}
