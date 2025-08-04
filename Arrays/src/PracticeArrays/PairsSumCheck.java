package PracticeArrays;

public class PairsSumCheck {

	public static void main(String[] args) {
		int [] arr= {1,5,7,-1,5};
		sumOfPairs(arr, 6);
	}
	public static void sumOfPairs(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i; j < arr.length; j++) {
				if (arr[i]+arr[j]==sum) {
				
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}
}
