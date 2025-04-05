import java.util.Scanner;
class  CountOfDigit
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.println(Count(num,0));
	}
	public static int Count(int num,int ct)
	{
		if (num==0)
		{
			return ct;
		}
		return Count(num/=10,++ct);
	}
}
