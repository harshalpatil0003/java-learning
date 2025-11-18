package StringMethods;

public class Trim {

	public static void main(String[] args) {
		String s="  Hars hal  ";
		System.out.println(trim(s));
	}
	public static String trim(String s) {
		String ans="";
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
			if (ch==' ') {
				continue;
			}
			else {
				ans+=ch;
			}
		}
		return ans;
	}
	
}
