package multidimensionarray;

import java.util.Arrays;

public class multiplyArrays {

	public static void main(String[] args) {
		int[][] arr1= {	{1,2,3},
						{2,3},
						{3}};
		
		int[][] arr2= {{1,2,3},
						{3},
						{4}};
		multiply(arr1, arr2);
	}
	public static void multiply(int[][]arr1, int[][] arr2) {
		
			if ( isSymmetric(arr1, arr2) && arr1.length == arr2[0].length) {
				
				int[][] ans= new int[arr1.length][arr2[0].length];
				for (int i = 0; i < arr1.length; i++) {
					for (int j= 0; j < arr2[0].length; j++) {
						for (int k = 0; k < arr2[0].length; k++) {
							ans[i][j] += arr1[i][k] * arr2[k][j];
						}
					}
				}	
				for (int j = 0; j < ans.length; j++) {
					System.out.println(Arrays.toString(ans[j]));
				}
			}
			else {
				System.out.println("Arrays are asymmetric ");
			}
	}
	public static boolean isSymmetric(int [][] arr1, int[][] arr2) {
		
		boolean check1=true, check2=true;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1.length!=arr1[0].length) {
				check1= false;
				break;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (arr2.length!=arr2[0].length) {
				check2= false;
				break;
			}
		}
		return check1==check2;
	}
}
