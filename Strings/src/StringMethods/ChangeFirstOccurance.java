package StringMethods;

import java.util.Iterator;

public class ChangeFirstOccurance {

	public static void main(String[] args) {
		String s="Harshal";
		System.out.println(replaceFirst(s, 'M'));
	}
	public static String replaceFirst(String s, char navin) {
		String ans="";
		
		for (int i = 0; i < s.length(); i++) {
			if (i==0) {
				ans+=navin;
			}
			else {
				ans+=s.charAt(i);
			}
		}
		return ans;
	}
}
