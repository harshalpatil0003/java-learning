package StringMethods;

public class PrintAllCharactersOfString {

	public static void main(String[] args) {
		String s= "Harshal";
		
		for (int i = 0; i < s.length(); i++) {
			
			System.out.println(i+" -> "+s.charAt(i));
			
		}
	}
}
