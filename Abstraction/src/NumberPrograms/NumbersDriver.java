package NumberPrograms;
import java.util.Scanner;

public class NumbersDriver {
	static int num;
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Numbers n1=new NumbersImplement();
	System.out.println("---- PRIME NUMBER ----");
	System.out.print("Enter Number: ");
	num = sc.nextInt();	
	if(n1.prime(num)) 
		System.out.println("It is prime number");
	else
		System.out.println("It is not prime number");
	
	System.out.println("---- FACTOR ----");
	System.out.print("Enter Number : ");
	num =sc.nextInt();
		System.out.println(n1.factor(num));
		
	
	System.out.println("---- FACTORIAL ----");
	System.out.print("Enter number: ");
	num=sc.nextInt();
	System.out.println(n1.factorial(num));
	
	System.out.println("---- SQUARE ROOT ----");
	System.out.print("Enter Number: ");
	num=sc.nextInt();
	System.out.println(n1.squareroot(num));
//	sc.close();
   }
}
