package Assignment4;

public class ThirdMaxElement {

	public static void main(String[] args) {
		int[] arr= {56,2,3,44,9,8};
		
		System.out.println(thirdLarge(arr));
	}
	public static int thirdLarge(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		int thirdMax =Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				thirdMax=secondMax;
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax && max!=arr[i]) {
				thirdMax=secondMax;
				secondMax=arr[i];
			}
			else if(arr[i]>thirdMax && max!=arr[i] && secondMax!=arr[i]) {
				thirdMax=arr[i];
			}
		}
		return thirdMax;
	}
}
