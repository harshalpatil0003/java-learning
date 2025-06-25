import java.util.Scanner;
public class Division {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Numerator: ");
		int num=sc.nextInt();
		System.out.print("Enter Denominator: ");
		int den=sc.nextInt();
		
		try {
			int ans=num/den;
			System.out.println("Division Is: "+ans);
		}
		catch(ArithmeticException ref)
		{
			System.out.println(ref);
			System.out.println("Cannot divide by Zero! ");
		}
		
		
		
	}
}
