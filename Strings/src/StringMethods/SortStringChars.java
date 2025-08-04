package StringMethods;

import java.util.Arrays;

public class SortStringChars {

	public static void main(String[] args) {
		String s="BCDEA";
		System.out.println(sortString(s));
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
}
