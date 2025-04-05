import java.util.Scanner;
class PrimeNum
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(Prime(num,2)?"Prime":"Not Prime");
	}
	public static boolean Prime(int num, int den )
	{
		if (num==den)
		{
			return true;
		}
		else if (num%den==0 || num==1)
		{
			return false;
		}
		return Prime(num,++den);
	}
}
