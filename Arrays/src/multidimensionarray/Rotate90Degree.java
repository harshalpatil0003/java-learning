package multidimensionarray;

import java.util.Arrays;
import java.util.Iterator;

public class Rotate90Degree {

	public static void main(String[] args) {
		int[][] arr= {	{1,2,3},
						{4,5,6},
						{7,8,9}};
		rotate(arr);
	}
	
	public static void rotate(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j>i) {
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
		for (int i = 0,j=arr.length-1; i < arr.length; i++) {
			for (int j2 = 0,k=arr.length-1; j2 < arr[i].length; j2++) {
				int[] temp=arr[j2];
				arr[j2]=arr[k];
				arr[k]=temp;
				k--;
				System.out.println(Arrays.toString(arr[i]));
			}
		}
		
	}
}
