import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter num1: ");
		float num1=new Scanner(System.in).nextFloat();

		System.out.print("Enter operator: ");
		char op=new Scanner(System.in).next().charAt(0);

		System.out.print("Enter num2: ");
		float num2=new Scanner(System.in).nextFloat();

		float ans=0;
		ans=(op=='+')?(num1+num2):
			(op=='-')?(num1-num2):
			(op=='*')?(num1*num2):
			(op=='/')?(num1/num2):
			(op=='%')?(num1%num2):0.00001f;
			
		String output=(num1+" "+op+" "+num2+" = "+ans);
		if(!(ans==0.00001f))
			System.out.println(output);
	}
}
