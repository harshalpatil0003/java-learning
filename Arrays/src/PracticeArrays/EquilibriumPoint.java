package PracticeArrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		int[] arr= {1,4,6,5,3,2,3,5,6};
		System.out.println(equilibrium(arr));
	}
	
	//1+4+6+5==2+3+5+6;
	// 3 is equilibrium point.
	public static int equilibrium(int[] arr) {
		int leftSum=0, rightSum=0;
		int i,j;
		for (i = 0, j=arr.length-1 ; i<j; i++,j--) {
			if ((arr.length-1)%2==0) {
				leftSum+=arr[i];
				rightSum+=arr[j];
			} else {
				System.out.println("Array dont have Equilibrium point! ");
				break;
			}
			
		}
		return (arr[i]==arr[j] && leftSum==rightSum)?(arr[i]):(-1);
	}
	
}
