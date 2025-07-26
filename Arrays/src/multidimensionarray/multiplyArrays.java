package multidimensionarray;

import java.util.Arrays;
import java.util.Iterator;

public class multiplyArrays {

	public static void main(String[] args) {
		int[][] arr1= {	{1,2},
						{3,4}};
		
		int[][] arr2= {{1,2},
						{3,4}};
		multiply(arr1, arr2);
	}
	public static void multiply(int[][]arr1, int[][] arr2) {
		
			if (arr1[0].length == arr2.length) {
				int[][] ans= new int[arr1.length][arr2[0].length];
				for (int i = 0; i < arr1.length; i++) {
					for (int j= 0; j < arr2[0].length; j++) {
						for (int k = 0; k < arr1[0].length; k++) {
							ans[i][j] += arr1[i][k] * arr2[k][j];
						}
					}
				}	
				for (int j = 0; j < ans.length; j++) {
					System.out.println(Arrays.toString(ans[j]));
				}
			}
	}
}
