import java.util.Scanner;
class ArmstrongNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(sumOfDigit(num,num,0)?"Armstrong Number":"Not Armstrong Number");
	}
	public static boolean sumOfDigit(int num,int temp,int sum)
	{
		sum+=power(temp%10,count(num,0));
		return temp==0?num==sum:sumOfDigit(num,temp/10,sum);
	}
	public static int power(int num,int pow)
	{
		if (pow==0)
		{
			return 1;
		}

		return num*power(num,pow-1);
	}
	public static int count(int num,int ct)
	{
		if (num==0)
		{
			return ct;
		}
		return count(num/10,++ct);
	}
}
