package Assignment4;

public class SecondMin {

	public static void main(String[] args) {
		int[] arr= {2,2,3,4,5,6,3};
		System.out.println(secondSmall(arr));
	}
	public static int secondSmall(int[] arr) {
		
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				secondMin=min;
				min=arr[i];
			}
			else if(arr[i]<secondMin && min!=arr[i]) {
				secondMin=arr[i];
			}		
		}
		return secondMin;
	}
}
