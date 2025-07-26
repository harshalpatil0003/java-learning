package multidimensionarray;

import java.util.Arrays;
import java.util.Iterator;

public class sumOfDiagonalEle {

	public static void main(String[] args) {
		int[][] arr= {	{1,2,3},
						{4,5,6},
						{7,8,9}	};
		System.out.println("Sum of diagonal elements: "+sumofDiagonalEle(arr));
		makeDiagonalZero(arr);
	}
	public static int sumofDiagonalEle(int[][]arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i==j || i+j==arr.length-1) {
					sum+=arr[i][j];
				}
				
			}
		}
		return sum;
	}
	public static void makeDiagonalZero(int[][] arr) {
		System.out.println("Made diagonal elements zero");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i==j || i+j==arr.length-1) {
					arr[i][j]=0;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
