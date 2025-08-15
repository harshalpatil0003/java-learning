package StringMethods;

import java.util.Arrays;
//import java.util.Iterator;

public class PasswordVerification {

	public static void main(String[] args) {
		String[] password= {"coffee", "hdjhellohj54465&","har5*scodeal","%4hjuK5","ahh456&"};
		String[] dic= {"code", "coffee","hello"};
		System.out.println(Arrays.toString(passwordManager(password, dic)));
	}
	public static  String[] passwordManager(String[] password, String[] dic) {
		
		String[] ans=new String[password.length];
		
		int i;
		for (i = 0; i < password.length; i++) {
			if (password[i].length()>6) {
				
				String pass=password[i];
				int cnt=0;
				for (int j = 0; j < pass.length(); j++) {
					char ch=pass.charAt(j);
					
					if (ch>='0' && ch<='9'||ch>'A' && ch<='Z' ||ch>='a' && ch<='z') {
						cnt++;
					}
					if (cnt==pass.length()) {
						ans[i]="weak";
						cnt=0;
					}
					else {
						ans[i]="strong";
					}
				}
				for (int j = 0; j < dic.length; j++) {
					if (conatins1(pass, dic[j])) {
						ans[i]="weak";
					}
				}
			}
			else {
				ans[i]="weak";
			}
		}
	return ans;
	}
	
	public static boolean conatins1(String s1, String s2) {
		
		for (int i = 0; i < s1.length()-1; i++) {
			
			if (s1.charAt(i)==s2.charAt(0)) {
				int cnt=0;
				for (int j = 0,k=i; j < s2.length();) {
					if (s1.charAt(k)==s2.charAt(j)) {
						cnt++;
						j++;
						k++;
					}
					else {
						break;
					}
				}
				if (cnt==s2.length()) {
					return true;
				} 
			}
		}
		return false;
	}
}
