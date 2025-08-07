package StringMethods;

import java.util.Arrays;

public class Panagram {

	// string should contain all alphabets atleast once either uppercase or lowercase
	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(s));
		
	}
	public static boolean isPanagram (String s) {
		
		int [] arr= new int[26];
		
		for (int i = 0; i < s.length(); i++) {		
			char ch=s.charAt(i);
			if (ch>='a' && ch<='z'){
				arr[ch-97]++;
			}
			else if(ch>='A' && ch<='Z'){
				arr[ch-65]++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				return false;
			}
		}
		return true;
	}
}

