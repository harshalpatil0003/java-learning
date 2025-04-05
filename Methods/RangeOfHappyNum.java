import java.util.Scanner;
class RangeOfHappyNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter range of Happy numbers: ");
		int num=new Scanner(System.in).nextInt();
		for (int i=1;i<=num;i++ )
		{
			if (isHappy(i))
			{
				System.out.println(i);
			}

		}

	}
	public static int sumOfSqOfDigit(int num)
	{
		int sum=0;
		while (num>0)
		{
			int rem=num%10;
			sum+=(rem*rem);
			num/=10;
		}
		return sum;
	}
	public static boolean isHappy(int num)
	{
		int sum=sumOfSqOfDigit(num);
		while (sum!=4 && sum!=1)
		{
			sum=sumOfSqOfDigit(sum);
		}
		return sum==1?true:false;
	}
}
