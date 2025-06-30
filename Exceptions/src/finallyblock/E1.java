package finallyblock;

import java.util.Scanner;

public class E1 {

	public static void main(String[] args){
	
		
		try {
			division(10,0);
		} catch (ArithmeticException e) {
		System.out.println("Cannot divide with Zero!");
		}
	}
			
	
	public static void division(int a, int b) {
		System.out.println(a/b);
	}
}
	
