import java.util.Scanner;
class PseudoPrimeNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number:");
		int num=new Scanner(System.in).nextInt();
		System.out.print(isPeudoPrime(num));
	}
	public static boolean isPeudoPrime(int num)
	{
		if (!isPrime(num))
		{
			return power(2,num-1)%num==1;
		}
		return false;

	}
	public static int power(int num,int pow)
	{
		int power=1;
		for (int i=1;i<=pow ;i++ )
		{
			power*=num;
		}
		return power;

	}
	public static boolean isPrime(int num)
	{
		int den=2;
		if (num>=2)
		{
			while (num>den)
			{
				if (num%den==0)
				{
					return false;
				}
				den++;
			}
			return true;
		}
		return false;

	}
}
