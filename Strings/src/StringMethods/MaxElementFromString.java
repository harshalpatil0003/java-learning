package StringMethods;

public class MaxElementFromString {

	public static void main(String[] args) {
		
		String s= "harshal";
//		maxElement(s);
		System.out.println(maxElement(s));
	}
	public static char maxElement(String s) {
		char max=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch>max) {
				max=ch;
			}
		}
		return max;
	}
}
