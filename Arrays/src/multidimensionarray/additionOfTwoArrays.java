
package multidimensionarray;

import java.util.Arrays;

public class additionOfTwoArrays {

	public static void main(String[] args) {
		int[][] arr1= {	{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		int[][] arr2= {	{1,2,3},
						{4,5,6},
						{7,8,9}};
		addArrays(arr1, arr2);
		
	}
	public static void addArrays(int[][] arr1, int[][] arr2) {
		if (arr1.length==arr2.length) {
			int i;
			for ( i = 0; i < arr1.length; i++) {
				if (arr1[i].length!=arr2[i].length) {
					break;
				}
			}
			if (i==arr1.length) {
				int[][] ans= new int[arr1.length][arr1[0].length];
				for (int j = 0; j < arr1.length; j++) {
					for (int j2 = 0; j2 < arr2[j].length; j2++) {
					ans[j][j2]=arr1[j][j2]+arr2[j][j2];
					}
				}
				for (int j = 0; j < ans.length; j++) {
					System.out.println(Arrays.toString(ans[j]));
				}
			}
		}
	}
}
