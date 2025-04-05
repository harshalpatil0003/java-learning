import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(sum(num)==num?"it is neon number":" it is not neon number");
	}
	public static int sum(int num) 
	{
		int sum=0;
		int square=num*num;
		for (int i=square;i>0 ;i/=10 )
		{
			sum+=i%10;
		}
		return sum;
	}
}
