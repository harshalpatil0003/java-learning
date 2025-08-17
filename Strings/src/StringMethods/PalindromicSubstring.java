package StringMethods;

import java.util.Iterator;

public class PalindromicSubstring {

	public static void main(String[] args) {
		String s="abab";
		System.out.println(palindromicSubstring(s));
		//System.out.println(s.substring(0, 4));
	}
	public static String palindromicSubstring(String s){
		
		s=addSpaces(s);
		String ans="";
		int max=0;
		int i=0,j=0,k=0;
		String temp="";
		while(i<s.length()) {

			if (j>0 && k<s.length()-1) {
				if (s.charAt(j-1)==s.charAt(k+1)) {
					j--;
					k++;
				}
				else if(k-j>0) {
					temp=s.substring(j, k+1);
					if (temp.length()>max) {
						max=temp.length();
						ans=temp;
					}
					i++;
					j=k=i;
				}else {
					i++;
					j=k=i;
				}
			}
			else {
				if (k-j>0) {
					temp=s.substring(j, k+1);
					if (temp.length()>max) {
						max=temp.length();
						ans=temp;	
					}
				}
				i++;
				j=k=i;
			}
		}
		String lans="";
		for (int l = 0; l < ans.length(); l++) {
			if (ans.charAt(l)==32) {
				continue;
			}
			else {
				lans+=ans.charAt(l);
			}
		}
		return lans;
	}
	public static String addSpaces(String s) {
		String ans="";
		
		for (int i = 0; i < s.length(); i++) {
			ans+=s.charAt(i)+" ";
		}
		return ans;
	}
}
