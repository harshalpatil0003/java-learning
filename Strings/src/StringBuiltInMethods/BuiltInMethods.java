package StringBuiltInMethods;

import java.util.Arrays;

public class BuiltInMethods {

	public static void main(String[] args) {
		String s="Encyclopedia";
		System.out.println(s.charAt(0));
		System.out.println(s.codePointAt(1));
		System.out.println(s.codePointBefore(1));
		System.out.println(s.codePointCount(5, 9));
		System.out.println("Vinay".compareTo("Vijay"));
		System.out.println("Vinay".compareToIgnoreCase("Vijay"));
		System.out.println("Hi".concat(" Hello!"));
		System.out.println(s.contains("pedia"));
		System.out.println("Hi".contentEquals("Hi"));
		System.out.println(s.endsWith("pedia"));
		System.out.println(s.startsWith("Ency"));
		byte[] arr=s.getBytes();
		System.out.println(Arrays.toString(arr));
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('p',7));
		System.out.println(s.indexOf("opedia"));
		System.out.println(" ".isBlank());
		System.out.println(" ".isEmpty());
		System.out.println(s.lastIndexOf('n'));
		System.out.println(s.length());
		System.out.println("ABC ".repeat(5));
		System.out.println(s.replace('a', '@'));
		System.out.println(s.replace("pedia", "media"));
		System.out.println("  ABC  ".strip());
		System.out.println(s.substring(9));
		System.out.println(s.substring(3, 12));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		String s2="I am Harshal";
		String[] name=s2.split("0");
		System.out.println(Arrays.toString(name));
		
		char[] ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		
	}
}
