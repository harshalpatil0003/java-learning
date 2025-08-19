package StringMethods;

import java.util.Arrays;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s1="xxy";
		String s2="aab";
		System.out.println((isIsomorphic(s1, s2))?("Isomorphic"):("Not Isomorphic"));
		//System.out.println(Arrays.toString(freq(s1)));	
		//System.out.println(Arrays.toString(freq(s1)));
		//System.out.println(Arrays.toString(freq(s2)));
		//System.out.println(Arrays.toString(toCharArray1(s1)));
	}
	public static boolean isIsomorphic (String s1, String s2) {
		
		if (s1.length()==s2.length()) {
			
			int[] arr1=freq(s1);
			int[] arr2=freq(s2);
			int cnt=0;
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i]==arr2[i]) {
					cnt++;
				}
			}
			if (cnt==arr1.length) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	
	}
	public static int[] freq(String s1) {
		
		char[] ch= toCharArray1(s1);
		//System.out.println(Arrays.toString(ch));
		int[] freq= new int[s1.length()];
		int cnt=0;
		//System.out.println(Arrays.toString(freq));
		for (int i = 0; i < ch.length; i++) {
			
			if (freq[i] !=-1) {
				
				for (int j = i+1; j < ch.length; j++) {
					if (ch[i]==ch[j]) {
						cnt++;
						freq[j]=-1;
					}
				}
				freq[i]=cnt;
			}
		}
	return freq;
	}
	
	public static char[] toCharArray1(String s) {
		
		char[] ch= new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i]=s.charAt(i);
		}
		return ch;
	}
}
