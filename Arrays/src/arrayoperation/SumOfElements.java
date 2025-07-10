package arrayoperation;

public class SumOfElements {
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		System.out.println(sum(arr));
	}
	//this method returns sum of elements of arrays
	public static int sum(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
