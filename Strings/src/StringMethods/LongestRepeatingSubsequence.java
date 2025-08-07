package StringMethods;

import java.util.Arrays;

public class LongestRepeatingSubsequence {

	public static void main(String[] args) {
		
		String s="aabbbbcacccaaacb";
		subSequence(s);
		
	}
	public static void subSequence(String s) {
		char[] arr= s.toCharArray();
		
		int cnt=0, max=0;
		char ch=0;
		for (int i = 0; i < arr.length-1; i++) {
			
			if (arr[i]==arr[i+1]) {
				cnt++;
			}
			else {
				if (cnt>max) {
					max=cnt;
					ch=arr[i];
				}
				cnt=0;
			}
		}
		System.out.println(Arrays.toString(arr));
		String ans="";
		for (int i = 0; i <(max+1); i++) {
			ans+=ch;
		}
		System.out.println(ans);
		if (max>0) {
			System.out.println(ch+ " repeated for "+(max+1)+" times");
		} else {
			System.out.println("no repetation!");
		}
	}
}
