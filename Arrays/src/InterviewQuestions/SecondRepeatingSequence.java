package InterviewQuestions;

public class SecondRepeatingSequence {

	public static void main(String[] args) {
		int[] arr= {2,2,2,2,1,1,1};
		secRepeatingSeq(arr);
	}
	public static void secRepeatingSeq(int[] arr) {
		
		int max=0, secMax=0, cnt=0, num=arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==arr[i+1]) {
				cnt++;
				
			}
			else {
				if (cnt>max) {
					secMax=max;
					max=cnt;
					num=arr[i+1];
				}
				cnt=0;
				
			}
		}
	
		if (cnt>max) {
			secMax=max;
			max=cnt;
			num=arr[arr.length-1];
		}
		if (secMax>0) {
			System.out.println(num+" repeated "+(secMax+1)+" times ");
		}
		else {
			System.out.println("No repeated! ");
		}
	}
}
