import java.util.Scanner;
class SumOfDigitsInNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number: ");
		int num=new Scanner(System.in).nextInt();
		int sum=0;
		for (;num>0;num/=10)
		{
			int rem=num%10;
			sum+=rem;
		}
			System.out.print(sum);
	}
}
