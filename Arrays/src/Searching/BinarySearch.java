package Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {-7,-5,-1,0,1,4,8,9,56,65,100}; 
		System.out.print("Enter Element: ");
		int ele= new Scanner(System.in).nextInt();
		binarySearch(arr,ele);
		
	}
	// Binary Search
	// Time Complexity: O(nlogn)
	public static void binarySearch(int[] arr, int ele) {
		int start=0, end=arr.length-1, mid=(start+end)/2;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[start]==ele) {
				System.out.println("Element found at "+start+" index!");
				break;
			}
			else if (arr[end]==ele) {
				System.out.println("Element found at "+end+" index!");
				break;
			}
			else if (arr[mid]==ele) {
				System.out.println("Element found at "+mid+" index!");
				break;	
			}
			else if(ele<arr[mid]) {
				end=mid-1;
			}
			else if(ele>arr[mid]) {
				start=mid+1;
			}
			
			mid=(start+end)/2;
		}
		
	}
}
