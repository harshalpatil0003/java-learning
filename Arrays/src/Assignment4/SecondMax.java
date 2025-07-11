package Assignment4;

public class SecondMax {

	public static void main(String[] args) {
		int[] arr= {5,6,6,8,8,2,3,5};
		
		System.out.println(secondLarge(arr));
		
	}
	public static int secondLarge(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax && max!=arr[i]) {
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
}
