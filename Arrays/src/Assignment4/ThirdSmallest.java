package Assignment4;

public class ThirdSmallest {

	public static void main(String[] args) {
		int[] arr= {2,2,3,3,4,5,6};
		System.out.println(thirdSmallest(arr));
	}
	public static int thirdSmallest(int[] arr) {
		
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		int thirdMin=Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				thirdMin=secondMin;
				secondMin=thirdMin;
				min=arr[i];
			}
			else if(arr[i]<secondMin && min!=arr[i]) {
				thirdMin=secondMin;
				secondMin=arr[i];
			}
			else if (arr[i]<thirdMin && min!=arr[i] && secondMin!=arr[i]) {
				thirdMin=arr[i];
			}
		}
		return thirdMin;
		
	}
}
