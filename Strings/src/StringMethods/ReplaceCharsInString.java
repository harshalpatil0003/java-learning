package StringMethods;

public class ReplaceCharsInString {

	public static void main(String[] args) {
		String S="Banana";
		System.out.println(replace(S, 'a', '@'));
	}
	public static String replace(String s, char Oldchar, char Newchar) {
		String ans="";
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch==Oldchar) {
				ans=ans+Newchar;	
			}
			else {
				ans=ans+ch;
			}
		}
		return ans;
	}
}
