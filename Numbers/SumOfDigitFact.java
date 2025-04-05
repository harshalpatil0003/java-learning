import java.util.Scanner;
class SumOfDigitFact 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int dup=num;
		int sum=0;
		while (num>0)
		{
			int fact=1;
			int rem=num%10;
			for (int i=1;i<=rem ; i++)
			{
				fact*=i;
			}
			num/=10;
			sum+=fact;
		}
		System.out.println("Sum of factorial of digits in number "+dup+" is "+sum);
	}
}
