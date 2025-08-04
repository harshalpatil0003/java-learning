package StringMethods;

import java.util.Arrays;

public class StoreCharsIntoArray {

	public static void main(String[] args) {
		String name="Harshal Patil";
		System.out.println(Arrays.toString(StringtoArray(name)));
		
	}
	
	public static char[] StringtoArray(String name) {

		char[] ch= new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			ch[i]=name.charAt(i);
		}
		return ch;
	}
	
}
