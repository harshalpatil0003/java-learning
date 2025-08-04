package StringMethods;

public class SubString {

	public static void main(String[] args) {
		String s="Encyclopedia";
		System.out.println(subString(s, 0, 5));
	}
	public static String subString(String s, int start, int end) {
		
		String ans="";
		for (int i = start; i <end; i++) {
			ans+=s.charAt(i);
		}
		return ans;
	}
}