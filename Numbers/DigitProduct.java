import java.util.Scanner;
class DigitProduct 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int pro=1;
		int dup=num;

		int rem=num%10;
		pro=pro*rem;
		num=num/10;

		rem=num%10;
		pro=pro*rem;
		num=num/10;

		rem=num%10;
		pro=pro*rem;
		num=num/10;

		rem=num%10;
		pro=pro*rem;
		num=num/10;

		System.out.println("Product of digits in num "+dup+" is "+pro);
	}
}
