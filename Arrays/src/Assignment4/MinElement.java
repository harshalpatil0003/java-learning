package Assignment4;

public class MinElement {

	public static void main(String[] args) {
		int[] arr= {-1,3,5,4,10,-23,7};
		System.out.println(minElement(arr));
	}
	public static int minElement(int[] arr) {
		
		int min=Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
}
