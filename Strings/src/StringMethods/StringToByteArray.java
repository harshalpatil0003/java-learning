package StringMethods;

import java.util.Arrays;

public class StringToByteArray {

	public static void main(String[] args) {
		String s= "I'am Indian!";
		System.out.println(Arrays.toString(StringToByteArray(s)));
		
	}
	public static Byte[] StringToByteArray(String s) {
		Byte[] arr= new Byte[s.length()];
		for (int i = 0; i < s.length(); i++) {
		
			arr[i]=(byte)s.charAt(i);
			System.out.println(s.charAt(i));
		}
		return arr;
	}
}
