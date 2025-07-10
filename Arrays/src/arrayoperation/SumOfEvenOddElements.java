package arrayoperation;

public class SumOfEvenOddElements {

	public static void main(String[] args) {
		
		int[] arr= {10,50,30,40,50};
		System.out.println(evenoddSum(arr)? "sum is equal":"sum is not equal");
	}
	
	public static boolean evenoddSum(int[] arr) {
		
		int evenSum=0;
		int oddSum=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				evenSum+=arr[i];
				
			}
			if(i%2==1) {
				oddSum+=arr[i];
			}
		}
		System.out.println("Even sum: "+evenSum);
		System.out.println("Odd sum: "+oddSum);
		return evenSum==oddSum;
	}
}
