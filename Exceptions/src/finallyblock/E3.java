package finallyblock;

import java.util.Scanner;

public class E3{
	
	public static void main(String[] args) {
	
		try {
		Scanner sc=null;
		int num=sc.nextInt();
		}
		
		catch(NullPointerException ref) {
			try {
				System.out.println(10/0);
			} catch (ArithmeticException e) {
				System.out.println("Cannot divide by Zero!");
			
			}
			finally {
				System.out.println("Inner finally");
			}
		}
		finally {
			System.out.println("Thank You!");
		}	
	}
}