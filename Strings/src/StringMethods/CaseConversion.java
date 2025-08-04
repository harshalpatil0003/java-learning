package StringMethods;

public class CaseConversion {

	public static void main(String[] args) {
		String h="harshal";
		String p="PATIL";
		
		System.out.println(toUppercase(h));
		System.out.println(toLowercase(p));
	}
	public static String toUppercase(String s) {
		String ans="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch>='a'&& ch<='z') {
				ans=ans+(char)(ch-32);
			}
		}
		return ans;
	}
	
	public static String toLowercase(String s) {
		String ans= "";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch>='A' && ch<='Z') {
				ans=ans+(char)(ch+32);
			}
		}
		return ans;
	}
}
