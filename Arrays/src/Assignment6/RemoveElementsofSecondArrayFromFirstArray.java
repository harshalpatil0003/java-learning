package Assignment6;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveElementsofSecondArrayFromFirstArray {

	public static void main(String[] args) {
		int[] arr1= {10,20,30,4,50,60,20};
		int[] arr2= {10,100,60,30};
		System.out.println(Arrays.toString(removeElementsFromArray(arr1, arr2)));
		
	}
	public static int[] removeElementsFromArray(int[] arr1,int[] arr2){
		
		boolean[] occ= new boolean[arr1.length];
		int ct=0;
		for (int i = 0; i < arr2.length; i++)
		{
			
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j]==arr2[i]) {
					ct++;
					occ[j]=true;
				}
			}
		}
		if (ct>0)
		{
			int[] ans=new int[ct];
			for (int i = 0, j=0; i < arr1.length; i++) {
				if (occ[i]==true) {
					ans[j]=arr1[i];
					j++;
				}
			}
			return ans;
		}
		return arr1;
		
	}
}
