package Assignment6;

import java.util.Arrays;

public class RetainRange {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		System.out.println(Arrays.toString(retainRange(arr, 2, 4,true)));
		//retainRange(arr, 2, 4);
		
	}
	//this method returns the array between specified range.
	public static int[] retainRange(int[] arr, int start, int end) {
		
		if (start>=0 && end<=arr.length && start<=end) 
		{
			int[] ans=new int[end-start];
			for (int i = start,j=0; i < end; i++) {
				ans[j]=arr[i];
				j++;
			}

			return ans;
		}
		
		return null;
	}	
	
	// whether to include last element or not.
	public static int[] retainRange(int[] arr, int start, int end, boolean inc) {
		if (inc) {
			return retainRange(arr, start, end+1);
		}
		else {
			return retainRange(arr, start, end);
		}
	}
}
