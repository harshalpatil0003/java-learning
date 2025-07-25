package multidimensionarray;

public class sumOfUpperLowerTriangleEle {

	public static void main(String[] args) {
		int[][] arr= {	{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		upperlowerSum(arr);
	}
	
	public static void upperlowerSum(int[][] arr) {
		int upperSum=0;
		int lowerSum=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j>i) {
					upperSum+=arr[i][j];
				}
				else if (i>j) {
					lowerSum+=arr[i][j];
				}
			}
		}
		System.out.println("Upper Sum: "+upperSum);
		System.out.println("Lower Sum: "+lowerSum);
	}
}
