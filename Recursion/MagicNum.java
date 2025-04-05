import java.util.Scanner;
class MagicNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(isMagic(num)?"It is Magic Number":"It is not Magic Number");
	}
	public static boolean isMagic(int num)
	{
		int sum=sumOfDigit(num,0);
		if (num>0)
		{
			sum=sumOfDigit(sum,0);
		}
		return sum==1;
	}
	public static int sumOfDigit(int num,int sum)
	{
		if (num==0)
		{
			return sum;
		}
		sum+=(num%10);
		return sumOfDigit(num/10,sum);
	}
}
