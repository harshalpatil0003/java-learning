package StringMethods;

public class StringLength {

	public static void main(String[] args) {
		String s= "Harshal";
	System.out.println(length(s));
	}
	public static int length(String s) {
		int cnt=0;
		try {
		for (int i = 0; ; i++) {
			cnt++;
			System.out.println(s.charAt(i));;
		}
		}catch(StringIndexOutOfBoundsException ref) {
			return cnt;
		}
		
	}
}
