import java.util.Scanner;
class TwinPrime
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(nextPrime(num));
	}
	public static int nextPrime(int num)
	{
		int next=prime(num);
		if (prime(next))
		{
			next=prime(num+1);
		}
			return next;
	}
	public static int prime(int num)
	{
		int den=2;
		while (num>den)
		{
			if (num%den==0)
			{
				break;
			}
			else if (den==num)
			{
				return den;
			}
			den++;
		}
		return den;
	}

}
