package primitivetoString;

public class PrimitiveToString {

	public static void main(String[] args) {
		
		// using valueOf() method of String Class we can convert 
		// any peimitive datatype to String form.
		
		int a=100;
		String s=String.valueOf(a);
		System.out.println(s);
		
		char c='H';
		String s1=String.valueOf(c);
		System.out.println(s1);
		
		System.out.println(String.valueOf(22.35f));
		
		System.out.println(String.valueOf(2.3365555558855655));
		
		boolean flag=true;
		String s2=String.valueOf(flag);
		System.out.println(s2);
		
		
	}
}
