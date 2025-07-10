package arrayoperation;

public class Palindrome {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,4,3,2,1};
		System.out.println(isPalindrome(arr));
	}
	
	// method checks whether array is palindrome or not
	public static String isPalindrome(int[] arr) {
		
		int i=0 ,j=arr.length-1;
		while (i<j) {
			if(arr[i]==arr[j])
			{
				i++;
				j--;
			}
			else {
				break;
			}
			
		}
		return i>=j?"Palindrome ":"Not Palindrome";
	}
}
