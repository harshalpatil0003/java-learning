import java.util.Scanner;
class SumOfFactors 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int sum=0;
		for (int i=1;i<=num ;i++)
		{
			if (num%i==0)
			{
				System.out.print(i+" ");
				sum+=i;

			}
		}
		System.out.println();
		System.out.println("Sum of factors of number "+sum);
	}
}
