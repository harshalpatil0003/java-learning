package parsing;

public class Parsing {

	public static void main(String[] args) {
		 
		// parsing is a way of converting String into its respective 
		// primitive type.
		String s1="2423";
		int i= Integer.parseInt(s1);
		System.out.println(i);
		
		String s2="harsh";
		char c=s2.charAt(0);
		System.out.println(c);
		
		String s3="flase";
		boolean flag=Boolean.parseBoolean(s3);
		System.out.println(flag); 
		
		String s4="56.655";
		float f=Float.parseFloat(s4);
		System.out.println(f);

	}
}
