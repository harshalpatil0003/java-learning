package StringMethods;

public class Contains {

	public static void main(String[] args) {
		String s="aeroplateplane";
		System.err.println(contains(s, "plane"));
		System.out.println(contains2(s, "plane"));
		
	}
	public static boolean contains(String s, String t) {
		
		int check =0;
		for (int i = 0; i < s.length(); i++) {
			
			if(check<t.length() && s.charAt(i)==t.charAt(check)) {
				check++;
			}
			else {
				if (check==t.length()){
					System.out.println(check);
					return true;
				}
				else if(check>0){
					i-=check;
					check=0;
				}
			}
		}
		return check==t.length();
		
	}
	// s= "Aeroplatplanplane" t="plane"
	public static boolean contains2(String s,String t) {
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i)==t.charAt(0)) {
				
				int j=0 ,k=i;
				while (j<t.length()) {
					if (s.charAt(k)!=t.charAt(j)) {
						break;
					}
					else {
						j++;
						k++;
					}
					if (j==t.length()) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
}
