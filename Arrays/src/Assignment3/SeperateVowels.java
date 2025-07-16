package Assignment3;

import java.util.Arrays;
import java.util.Iterator;

public class SeperateVowels {

	public static void main(String[] args) {
		char[] arr= {'b','c','a','d','e','f','g'};
		
//		for (int i = 0; i < arr.length; i++) {
//			vowelsSeperate(arr);
//		}
		//[c, a, d, e, f, g, b]
		System.out.println(Arrays.toString(vowelsSeperate(arr)));
		
	}
	public static char[] vowelsSeperate(char[] arr) {
		
		for (int i = 0,j=1; i < arr.length-1; i++,j++) {
			
			if (arr[i]!='a' || arr[i]!='e'|| arr[i]!='i' || arr[i]!='o' || arr[i]!='u') {
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return arr;
	}
}
