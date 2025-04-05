import java.util.Scanner;
class EvenOddSum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number: ");
		int num=new Scanner(System.in).nextInt();
		int evenSum=0;
		int oddSum=0;
		int temp=0;

		int newNum=num%10;
		temp=(newNum%2==0)?(evenSum=evenSum+newNum):(oddSum=oddSum+newNum);
		num=num/10;

		newNum=num%10;
		temp=(newNum%2==0)?(evenSum=evenSum+newNum):(oddSum=oddSum+newNum);
		num=num/10;

		newNum=num%10;
		temp=(newNum%2==0)?(evenSum=evenSum+newNum):(oddSum=oddSum+newNum);
		num=num/10;

		newNum=num%10;
		temp=(newNum%2==0)?(evenSum=evenSum+newNum):(oddSum=oddSum+newNum);

		System.out.println("Sum of even numbers: "+evenSum);
		System.out.println("Sum of odd numbers: "+oddSum);

	}
}
