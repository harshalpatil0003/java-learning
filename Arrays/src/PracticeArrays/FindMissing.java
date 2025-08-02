package PracticeArrays;

public class FindMissing {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5};
		System.out.println(findMissingInRange(arr));
	}
	public static int findMissingInRange(int[] arr) {
		int sum=0, cnt=0, max=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		// max element
		// n(n+1)/2-sum
		return sumOfnNumbers(arr, max)-sum;
	}
	public static int sumOfnNumbers(int[] arr,int max) {
		return max*(max+1)/2;
	}
}
