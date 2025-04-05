import java.util.Scanner;
class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.println(arm(num)? "Number is Armstrong":" Number is not Armstrong"); 
	}
	public static boolean arm(int num)
	{
		int sum=0;
		for (int i=num;i>0 ; i/=10)
		{
			sum+=power((i%10),cnt(num));
		}
		return sum==num;
	}
	public static int cnt(int num) 
	{
		int ct=0;
		for (int i=num;i>0 ; i/=10)
		{
			ct++;
		}
		return ct;
	}
	public static int power(int num, int pow)
	{
		int po=1;
		for (int i=1;i<=pow ;i++ )
		{
			po*=num;
		}
		return po;
	}

}
