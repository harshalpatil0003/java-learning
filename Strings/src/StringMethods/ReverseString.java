package StringMethods;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		String s="Harshal Patil";
		System.out.println(reverse(s));
	}
	public static String reverse(String s) {
		String ans="";
		for (int i = s.length()-1; i >=0 ; i--) {
			ans=ans+s.charAt(i);
		}
		return ans;
	}
}
