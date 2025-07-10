package arrayoperation;

public class RepetitionCount {

	public static void main(String[] args) {
		
		int[] arr= {1,1,1,1,1,2,2,2,3,3};
		count(arr);
	}
	 public static void count(int[] arr) {
		 int count=0, oldEle=0 ;
		 for (int i = 0; i < arr.length; i++)
		 {
			if (arr[i] != oldEle) {
				 oldEle = 0;
				 for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						oldEle = arr[i];
					}
				}
				 System.out.println(arr[i] + " : " + count);
			} 
		 }
			
		}
	 }

