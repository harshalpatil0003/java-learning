import java.util.Scanner;
class LazyNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter range of Numbers: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(lazy(num));

	}
	public static int lazy(int num)
	{
		int j=1;
		for (int i=0;i<=num ; i++)
		{
			j+=i;
			System.out.println(i+" --> "+j+" ");
		}
		return 0;
	}
}
