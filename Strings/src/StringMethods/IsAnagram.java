package StringMethods;

import java.util.Arrays;
import java.util.Iterator;

public class IsAnagram {

	public static void main(String[] args) {
		String s1="Elegant man".toLowerCase();
		String s2="A gentleman".toLowerCase();
		//System.out.println(isAnagram(s1,s2));
		System.out.println(isAnagram2(s1, s2));
		
	}
	public static boolean isAnagram(String s1, String s2) {
		if (s1.length()==s2.length()) {
			return sortString(s2).equals(sortString(s1));
		}
		return false;
	}
	
	public static String sortString(String s) {
		char[] ch=s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length-1-i; j++) {
				
				if (ch[j]>ch[j+1]) {
					char temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		return new String(ch);
	}
	// s1=bat s2=tab
	public static boolean isAnagram2(String s1, String s2) {
		if (s1.length()==s2.length()) {
			
			int[] ar1= new int[127];
			//int[] ar2= new int[127];
			for (int i = 0; i < s2.length(); i++) {
					ar1[s1.charAt(i)]++;
					ar1[s2.charAt(i)]++;
				
			}
			for (int i = 0; i < ar1.length; i++) {
				if (ar1[i]==2) {
					return true;
				}
			}
			return false;
		} 
		return false;
	}
}
