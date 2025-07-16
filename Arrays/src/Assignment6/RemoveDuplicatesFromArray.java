package Assignment6;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] arr= {2,1,3,2,1,5,6,2,5,7,8,9};
		System.out.println(Arrays.toString(removedupls(arr)));
		
	}
	
	// this method makes an array of frequency of repeated elements
	public static int[] frequency(int[] arr) {
		int[] freq= new int[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			int cnt=0;
			if (freq[i]!=-1)
			{
				
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i]==arr[j]) 
					{
						cnt++;
						freq[j]=-1;
					}
				}
				freq[i]=cnt;
			}
			
		}
		return freq;
	}
	
	// this method identifies repeated elements and removes them
	
	public static int[] removedupls(int[] arr) {
		
		int[] freq= frequency(arr);
		int count=0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i]==-1) {
				count++;
			}
		}
		
		if (count>0)
		{
			int[] ans= new int [arr.length-count];
			
			for (int i = 0, j=0; i < arr.length; i++) {
				if (freq[i]>=0) {
					ans[j]=arr[i];
					j++;
				}
			}
			return ans;
		}
		return null;
	}
}
