package StringMethods;

import java.util.Arrays;
import java.util.Iterator;

public class BinaryAddition {
	public static void main(String[] args) {
		String s1="1010";
		String s2="1011";
		System.out.println(Arrays.toString(binarySum(s1, s2)));
		//System.out.println(binarySum(s1, s2));
	}
	public static String[] binarySum(String s1, String s2) {
		
		char[] ch1= s1.toCharArray();
		char[] ch2= s2.toCharArray();
		String[] ans= new String[s1.length()+1];
		char carry='0';
		int k=ans.length-1;
		for (int i =ch2.length-1; i >=0; i--) {
			if (ch1.length==ch2.length) {
				if (ch1[i]=='1' && ch2[i]=='1'&& carry=='0') {
					ans[k--]="0";
					carry='1';
				}
				else if (ch1[i]=='0' && ch2[i]=='1'&& carry=='1') {
					ans[k--]="0";
				}
				else if (ch1[i]=='0' && ch2[i]=='1'&& carry=='0') {
					ans[k--]="1";
				}
				else if (ch1[i]=='1' && ch2[i]=='1'&& carry=='0') {
					ans[k--]="0";
				}
				else if (ch1[i]=='1' && ch2[i]=='1'&& carry=='1') {
					ans[k--]="1";
				}
				else if (ch1[i]=='1' && ch2[i]=='0'&& carry=='1') {
					ans[k--]="0";
				}
				else if (ch1[i]=='0' && ch2[i]=='0'&& carry=='1') {
					ans[k--]="1";
				}
				else if (ch1[i]=='0' && ch2[i]=='0'&& carry=='0') {
					ans[k--]="0";
				}
			}
			else {
				break;
			}
		}
		if (carry=='1') {
			ans[k]="1";
		}
		else {
			ans[k]="0";
		}
		
		return ans;
	}
	
}
