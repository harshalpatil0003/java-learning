package arrayoperation;

public class EvenOddElementsCount {

	public static void main(String[] args) {
		int[] arr= {1,5,6,7,9,8,52,5,2,4,5};
		count(arr);
	}
	public static void count(int[] arr) {
		
		int evenCount=0,oddCount=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		
		System.out.println("Count of even elements: "+evenCount);
		System.out.println("Count of odd elements: "+oddCount);
		
		
	}
}
