package multidimensionarray;

public class sumOfBoundryEle {

	public static void main(String[] args) {
		int[][] arr= {	{1,2,3},
						{4,5,6},
						{7,8,9}	};
		System.out.println("Sum of boundry elements: "+boundrySum(arr));
	}
	
	public static int boundrySum(int[][] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i==0 || j==0 || i==arr[i].length-1 || j==arr[j].length-1) {
					sum+=arr[i][j];
				}
			}
		}
		return sum;
	}
	
}
