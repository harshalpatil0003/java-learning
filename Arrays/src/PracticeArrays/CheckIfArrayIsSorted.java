package PracticeArrays;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		int[] arr= {1,2,4,3};
		System.err.println(isSorted(arr));
	}
	public static boolean isSorted(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			if (arr[i]>arr[i+1]) {		
				return false;
			}
		}
		return true;
	}
}
