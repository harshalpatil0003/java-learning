package Assignment7;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayOfUniueElements {

	public static void main(String[] args) {
		int[] arr= {1,2,3,2,1,5,6,3};
		
		System.out.println(Arrays.toString(frequency(arr)));
		
		System.out.println(Arrays.toString(uniqueElements(arr)));
		
		System.out.println(Arrays.toString(singleElements(arr)));
		
		System.out.println(Arrays.toString(repeated(arr)));
		
	}
	// method that finds the frequency of array elements.
		public static int[] frequency(int[] arr) {
			int[] freq= new int[arr.length];
			
			for (int i = 0; i < arr.length; i++) 
			{
				int cnt=0;
				if (freq[i]!=-1) {
					
					for (int j = i+1; j < freq.length; j++) {
						if (arr[j]==arr[i]) {
							cnt++;
							freq[j]=-1;
						}
					}
					freq[i]=cnt;
				}
			}
			return freq;
		}
		
	// methods return array of unique elements
	//output: [1,2,3,5,6]
	public static int[] uniqueElements(int[] arr) {
		int[] freq=frequency(arr);
		int ct=0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i]>=0) {
				ct++;
			}
		}
		int[] ans= new int[ct];
		if (ct>0)
		{
			for (int i = 0, j=0 ; i < freq.length ; i++) {
				if (freq[i]>=0) {
					ans[j]=arr[i];
					j++;
				}
			}
			return ans;
		}
		return arr;
		
	}
	
	
	
	// array of those elements who didn't repeat once
	//output: [5,6]
	public static int[] singleElements(int[] arr) {
		int[] freq= frequency(arr);
		int ct=0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i]==0) {
				ct++;
			}
		}
		
		int[] ans= new int[ct];
		if (ct>0) {
			for (int i = 0,j=0; i < freq.length; i++) {
				if (freq[i]==0) {
					ans[j]=arr[i];
					j++;
				}
			}
		}
		return ans;
	}
	
	//array of repeated elements
	//output: [1,2,3]
	public static int[] repeated(int[] arr) {
		
		int[] freq= frequency(arr);
		int ct=0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i]==1) {
				ct++;
			}
		}
		int[] ans=new int[ct];
		if (ct>0) 
		{
			for (int i = 0,j=0; i < freq.length; i++) {
				if (freq[i]==1) {
					ans[j]=arr[i];
					j++;
				}
			}
			
		}
		return ans;
	}
 }
