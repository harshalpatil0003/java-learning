package InterviewQuestions;

import java.util.Iterator;

public class LongestSubSequence {

	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,2,1,0,0,0,1,1,1,1,2,3};
		LongestSubSequence(arr);
		
	}
	
	public static void LongestSubSequence(int[] arr) {
		
		int max=0, cnt=0, num=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==arr[i+1]) {
				cnt++;
			}
			else {
				if (cnt> max) {
					max=cnt;
					num=arr[i];
				}
				cnt=0;
			}
		} 
		if (cnt> max) {
			max= cnt;
			num=arr[arr.length-1];
		}
		if (max>0) {
			System.out.println(num+" is repeated for "+(max+1)+" times.");
		}
		else {
			System.out.println("no repeatation! ");
		}
	}
}
