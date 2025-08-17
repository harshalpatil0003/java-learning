package StringMethods;

import java.util.Arrays;

public class SortDates {

	public static void main(String[] args) {
		String[] dts= {"15-mar-2003","01-dec-2000","20-jun-2003","15-aug-1947","26-nov-2008"};
		//sortDates(dts);
		System.out.println(Arrays.toString(sortDates(dts)));
	}
	
	public static String[] sortDates(String[] dts) {
		
		String[] month= {"jan", "feb", "mar","apr","may","jun","jul", "aug", "sep", "oct", "nov", "dec"};
		int year=0;
		int[] yr= new int[dts.length];
		;
		for (int i=0; i < dts.length; i++) {
			
			String date=dts[i];
			year=Integer.parseInt(date.substring(7, date.length()));
			yr[i]=year;
		}
		sort(yr);
		String[] sortdates= new String[dts.length];
		for (int i = 0; i < yr.length; i++) {
			sortdates[i]=Integer.toString(yr[i]);
		}
		for (int i = 0; i < sortdates.length; i++) {
			//System.out.println(dts[i].substring(7, dts[i].length())+", ");
			System.out.println(sortdates[i]);
			if (dts[i].substring(7, dts[i].length()).equals(sortdates[i])) {
				sortdates[i]=dts[i];
//				System.out.println(sortdates[i]+", ");
			System.out.println(dts[i]);
			}
			else {
				//sortdates[i]=dts[i];
			}
		}
		
		return sortdates;
	}
	
	
	public static int[] sort(int[] arr) {
		for (int j = 0; j < arr.length-1; j++) {
			for (int k = 0; k < arr.length-1-j; k++) {
				
				if (arr[k]>arr[k+1]) {
					
					int temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		return arr;
	}
}
