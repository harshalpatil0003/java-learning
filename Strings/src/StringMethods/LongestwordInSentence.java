package StringMethods;

public class LongestwordInSentence {

	public static void main(String[] args) {
		String s="Iam like to read encyclopedia and wikipedia about Argentinosaurus";
		System.out.println(longestString(s));
	}
	
	public static String longestString(String s) {
		
		String[] sent=s.split(" ");
		int max=0;
		String ans="";
		for (int i = 0; i < sent.length; i++) {
			if (sent[i].length()>max) {
				max=sent[i].length();
				ans=sent[i];
			}
		}
		return ans;
	}
}
