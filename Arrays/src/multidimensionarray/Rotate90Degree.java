package multidimensionarray;

import java.util.Arrays;

public class Rotate90Degree {

	public static void main(String[] args) {
		char[][] arr= {	{'a','b','c','d'},
						{'e','f','g','h'},
						{'i','j','k','l'},
						{'m','n','o','p'}};
		rotate(arr);
	}
	
	public static void rotate(char[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j>i) {
					char temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0,k=arr[i].length-1; j < arr.length/2; j++) {
				
				char temp=arr[i][j];
				arr[i][j]=arr[i][k];
				arr[i][k]=temp;
				k--;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
