package arrayoperation;

import java.util.Scanner;

public class CheckPresenceOfElementInArray {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10};
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Element: ");
		int ele=sc.nextInt();
		
		System.out.println(presence(arr, ele)?"Element Present": "Element Not present");
		
	}
	
	public static boolean presence(int[] arr,int ele) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==ele)
				return true;
			
		}
		return false;
	}
	
}
