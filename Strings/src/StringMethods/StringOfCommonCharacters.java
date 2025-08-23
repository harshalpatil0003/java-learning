package StringMethods;

import java.util.Arrays;
import java.util.Iterator;

public class StringOfCommonCharacters {

	public static void main(String[] args) {
		String s="01020102";
		System.out.println(Arrays.toString(cntOfCommonCharString(s)));
		//System.out.println(Arrays.toString(count(s)));
		//System.out.println(count(s));
	}
	public static int[] cntOfCommonCharString(String s) {
		char[] ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		String ele= count(s);
		char[] chs = new char[ele.length()];
		for (int i = 0; i < ele.length(); i++) {
			chs[i]=ele.charAt(i);
		}
		int[] check= new int[ele.length()];
		int cnt=0;
		System.out.println(Arrays.toString(chs));
		//char[] slide= new char[ele.length()];
		
		for (int i = 0; i < ch.length; i++) {
			
			for (int j = 0; j < chs.length; j++) {
				if (check[j]==0) {
					if (ch[i]==chs[j]) {
						check[j]++;
						System.out.println(Arrays.toString(check));
					}
				}
				
				if (check[2]==1) {
					cnt++;
					check[0]=0;
					check[1]=0;
					check[2]=0;
					
				}
				
				
			}
		
		}
		
		return check;
	}
	public static String count(String s) {
		char[] ch=s.toCharArray();
		
		int[] freq=new int[s.length()];
		for (int i = 0; i < ch.length; i++) {
			int cnt=0;
			if (freq[i]!=-1) {
				for (int j = i+1; j < ch.length; j++) {
					if (ch[i]==ch[j]) {
						cnt++;
						freq[j]=-1;
					}
				}
				freq[i]=cnt;
			}
		}
	String ans="";
		for (int i = 0; i < ch.length; i++) {
			if (freq[i]>=0) {
				ans+=ch[i];
			}
		}
		return ans;
	}
}
