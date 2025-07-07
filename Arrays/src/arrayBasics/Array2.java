package arrayBasics;

public class Array2 {

	public static void main(String[] args) {
		
		// storing elements in an array
		
		int[] arr= new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		String[] name= new String[4];
		
		name[0]="Harshal";
		name[1]="Ganesh";
		name[2]="Sanket";
		name[3]="Swanand";
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
	}
}
