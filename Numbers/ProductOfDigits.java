import java.util.Scanner;
class ProductOfDigits 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int dup=num;
		int pro=1;

		for (int i=1;i<=num ;num/=10)
		{
			int rem=num%10;
			pro*=rem;
		}
		System.out.println("Product of digits in number "+dup+" is "+pro);
	}
}
