package PracticeArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class Basics {

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,10};
		System.out.println("-----------------------");
		duplicate(arr);
		System.out.println("-----------------------");
		sum(arr);
		System.out.println("-----------------------");
		reverseArray(arr);
		System.out.println("-----------------------");
		IsPalindrome(arr);
		System.out.println("-----------------------");
		evenOddSum(arr);
		System.out.println("-----------------------");
		primeCount(arr);
		System.out.println("-----------------------");
		checkPresence(arr,2);
		System.out.println("-----------------------");
		//countOfRepeatEle(arr);
		System.out.println("-----------------------");
		reversehalfArray(arr);
 	}
	public static void duplicate(int[] arr) {
		int[] dup=new int [arr.length];
		for (int i = 0; i < dup.length; i++) {
			dup[i]=arr[i];
		}
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.println("Duplicate Array: "+Arrays.toString(dup));
	}
	public static int sum(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("Sum: "+sum);
		return sum;	
	}
	
	public static int[] reverseArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[arr.length-1-i];
		}
		System.out.println("Reverse Array: "+Arrays.toString(arr));
		return arr;
	}
	
	public static void IsPalindrome(int[] arr) {
		System.out.println("Check Palindrome");
		int i = 0,  j=arr.length-1;
		while (i<j) {
			if (arr[i]!=arr[j]) {
				break;
			}
			else {
				i++;
				j--;
			}
		}
		if (i>=j) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
		
	}
	public static void evenOddSum(int[] arr) {
		int evensum=0, oddsum=0 ,evencnt=0, oddcnt=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				evensum+=arr[i];
				evencnt++;
			}
			else {
				oddsum+=arr[i];
				oddcnt++;
			}
		}
		System.out.println("EvenSum: "+evensum+" Count: "+evencnt);
		System.out.println("Count: "+evencnt+" Count: "+oddcnt);
		
		System.out.println((evensum==oddsum)?("Sum is equal"):("sum is not equal"));
	}
	
	public static void primeCount(int[] arr) {
		int cnt=0; 
		for (int i = 0; i < arr.length; i++) {
			int den=2;
			while (den<arr[i]) {
				if (arr[i]%den==0) {
					break;
				}
				den++;
			}
			if (den==arr[i]) {
				cnt++;
			}
		}
		System.out.println("Prime count: "+cnt);
	}
	public static void checkPresence(int[] arr,int ele) {
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==ele) {
				cnt++;
				System.out.println("Element "+ele+" is present at index "+i);
				System.out.println(ele+" repeated "+(cnt-1)+" times");
			}
		}
		if (cnt==0) {
			System.out.println("Element not found! ");
		}
	}
	
	public static void reversehalfArray(int[] arr) {
		
		for (int i = 0,j=arr.length-1; i < arr.length; i++) {
			
				arr[i]=arr[arr.length-1-i];

		}
		System.out.println(Arrays.toString(arr));
	}
}