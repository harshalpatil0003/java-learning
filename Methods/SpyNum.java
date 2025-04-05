import java.util.Scanner;
class  SpyNum
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number: ");	
		int num=new Scanner(System.in).nextInt();
		if (sum(num)==pro(num))
		{
			System.out.println("It is spy num");	
		}
		else
			System.out.println("It is not spy num");	

	}
	public static int sum(int num)
	{
		int sum=0;
		while (num>0)
		{
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		return sum==pro(num);
	}
	public static int pro(int num)
	{
		int pro=1;
		while (num>0)
		{
			int rem=num%10;
			pro*=rem;
			num/=10;
		}
		return pro;
	}
}
