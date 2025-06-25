
import java.util.InputMismatchException;
import java.util.Scanner;
public class Division {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.print("Enter Numerator: ");
		int num=sc.nextInt();
		System.out.print("Enter Denominator: ");
		int den=sc.nextInt();
	
			 int ans=num/den;
			System.out.println("Division Is: "+ans);
		}
		catch(InputMismatchException ref) {
			System.out.println("Wrong input! ");
		}
		catch(ArithmeticException ref )
		{
			System.out.println("Cannot divide by Zero! ");
		}
		
		sc.close();
	}
}
