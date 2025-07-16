package Assignment6;

import java.util.Arrays;
import java.util.Iterator;

public class CountOfAllElementsInArray {

	public static void main(String[] args) {
		int[] arr= {1,5,6,6,5,2,3,1,5,6};
		System.out.println(Arrays.toString(countOccurances(arr)));
		//countOccurances(arr);
		
	}
	public static int[] countOccurances(int[]arr) {
		int[] count= new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int ct=0;
			
			if (count[i]!=-1)
			{
				
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i]==arr[j]) {
						ct++;
						count[j]=-1;
					}
				}
				count[i]=ct;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (arr[i]>=0) {
				System.out.println("Element "+arr[i]+" repeated "+i+ "times");
			}
		}
		return count;
		
	}
}
