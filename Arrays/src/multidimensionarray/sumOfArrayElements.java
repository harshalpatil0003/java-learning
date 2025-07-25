package multidimensionarray;

public class sumOfArrayElements {

	public static void main(String[] args) {
		int[][] arr= {	{1,2,3},
						{4,5,6},
						{7,8,9}};
		System.out.println("Sum of elements in array: "+sumOfArrayEle(arr));
		
	}
	
	public static int sumOfArrayEle(int[][]arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
		}
		return sum;
	}
}
