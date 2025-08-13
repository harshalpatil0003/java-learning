package StringMethods;

import java.util.Arrays;

public class CombinationsOfStringChars {

	public static void main(String[] args) {
		String s="abcd";
		char[] ch=s.toCharArray();
		permutations(ch, 0);
		
	}
	
	public static void permutations(char[] ch, int refIndex) {
		if (refIndex==ch.length-1) {
			System.out.println(Arrays.toString(ch));
			return ;
		}
		for (int i = refIndex; i < ch.length; i++) {
			swap(ch, i, refIndex);
			permutations(ch, refIndex+1);
			swap(ch, i, refIndex);
		}
	}
	public static void swap(char[] ch, int index, int refIndex) {
		
		char temp=ch[index];
		ch[index]=ch[refIndex];
		ch[refIndex]=temp;
	}
}
