package StringMethods;

import java.util.Arrays;
//import java.util.Iterator;

public class Split {

	public static void main(String[] args) {
		String s="Harshal ";
		System.out.println(Arrays.toString(split1(s, ' ')));
		
		System.out.println(Arrays.toString(s.split(" ")));
	}
	public static String[] split1(String s, char ref) {
		String temp="";
		int cnt=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==ref) {
				cnt++;
			}
		}
		String []ans= new String[cnt+1];
		for (int i = 0,j=0; i < s.length(); i++) {
			char ch= s.charAt(i);
			if(ch!=ref) {
				temp+=ch;
				
			}
			else {
				ans[j++]=temp;
				temp="";
			}
			
		}
		ans[ans.length-1]=temp;

		return ans;
	}
}
