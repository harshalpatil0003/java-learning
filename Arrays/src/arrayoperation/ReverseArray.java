package arrayoperation;

public class ReverseArray{
	
	public static void main(String[] args) {
		
		int[] arr= {2,4,6,8,10};
		reverse(arr);
		System.out.println();
	}
	
	public static void reverse(int[] arr) {
		
		for (int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}
}