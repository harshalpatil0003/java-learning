import java.util.Scanner;
class BuzzNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number:");
		int num=new Scanner(System.in).nextInt();
		System.out.print(buzz(num)?"buzz no":"not buzz no");

		
	}
	public static boolean buzz(int num)
	{

		return (num%7==0) ||(num%10==7);
	}
}
