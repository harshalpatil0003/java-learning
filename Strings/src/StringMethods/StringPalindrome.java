package StringMethods;

public class StringPalindrome {

	public static void main(String[] args) {
		String s= "malayalam";
		isPalindrome(s);
	}
	public static void isPalindrome(String s) {
		int i;
		for ( i = 0; i < s.length()/2; i++) {
			//System.out.println(s.charAt(i)==s.charAt(s.length()-1-i));
			if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
				break;
			}
		}
		if(i>=s.length()/2) {
			System.out.println("It is Palindrome! ");
		}
		else {
			System.out.println("It is not Palindrome!");
		}
		
	}
}
