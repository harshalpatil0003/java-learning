package multidimensionarray;

import java.util.Arrays;

public class Transpose {

	public static void main(String[] args) {
		int[][] arr= {	{1,2,3},
						{4,5,6},
						{7,8,9}};
			
		transposeArray(arr);
	}
	public static void transposeArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[i].length; j++) {
				if (j>i) {
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
}
