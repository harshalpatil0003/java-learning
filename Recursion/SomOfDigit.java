import java.util.Scanner;
class SomOfDigit 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(sumOfDigit(num,0));

	}
	public static int sumOfDigit(int num,int sum)
	{
		if (num==0)
		{
			return sum;
		}
		sum+=num%10;
		return sumOfDigit(num/10,sum);
	}
}
