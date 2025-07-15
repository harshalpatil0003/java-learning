package Assignment5;

import java.util.Arrays;
import java.util.Iterator;

public class SliceArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(sliceArray(arr)));
		System.out.println(Arrays.toString(sliceArray2(arr, 2, 5,false)));
		
	}
	
	// removing custom elements from array
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
	
	// removing an array from another array
	public static int[] sliceArray2(int[]arr, int start, int end) {
		
		if (start>0 && end<=arr.length && start<end) {
			int[] ans= new int[arr.length-(end-start)];
			
			for (int i = 0; i < arr.length;) {
				if (i<start) {
					ans[i]=arr[i];
					i++;
				}
				else if (i==start) {
					i+=(end-start);
					
				}
				else if(i>=end) {
					ans[i-(end-start)]=arr[i];
					i++;
				}
			}
			return ans;
		}
		return null;
	}
	
	public static int[] sliceArray2(int[] arr ,int start, int end, boolean inc) {
		if (inc) {
			return sliceArray2(arr, start, end+1);
		}
		else
			return sliceArray2(arr, start, end);
	}
}
