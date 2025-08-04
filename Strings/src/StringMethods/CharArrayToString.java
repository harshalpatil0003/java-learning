package StringMethods;

public class CharArrayToString {

	public static void main(String[] args) {
		
		char[] ch= {'p','a','t','i','l'};
		System.out.println(CharArrayToString(ch));
	}
	public static String CharArrayToString(char[] ch) {
		
		String ans="";
		for (int i = 0; i < ch.length; i++) {
			ans=ans+ch[i];
		}
		return ans;
	}
}
