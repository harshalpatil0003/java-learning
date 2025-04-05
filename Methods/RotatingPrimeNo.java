import java.util.Scanner;
class  RotatingPrimeNo
{
	public static void main(String[] args) 
	{
		System.out.print("Enter range of rotating prime numbers: ");
		int num=new Scanner(System.in).nextInt();
		for (int i=2; i<=num;i++ )
		{
			if (isRotatingPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isRotatingPrime(int num)
	{
		if (isPrime(num))
		{
			int rot=rotate(num);
			while(rot!=num && isPrime(rot))
			{
				rot=rotate(rot);
			}
			return num==rot;
		}
		return false;

	}
	public static int cnt(int num)
	{
		int ct=0;
		for (int i=num;i>0 ;i/=10 )
		{
			ct++;
		}
		return ct;
	}
	public static int power(int num,int power)
	{
		int pow=1;
		for (int i=1;i<=power ;i++ )
		{
			pow*=num;
		}
		return pow;
	}
	public static int rotate(int num)
	{
		int rem=num%10;
		return rem*power(10,cnt(num)-1)+(num/=10);
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		while (den<num)
		{
			if (num%den==0)
			{
				return false;
			}
			den++;
		}
		return true;
	}
}
