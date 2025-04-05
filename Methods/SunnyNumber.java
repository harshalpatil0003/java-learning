import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(isSunny(num)?"It is sunny number":" It is not sunny number");

	}
	public static boolean isSunny(int num)
	{
		int sqr=1;
		for (int i=1;i<=num ;i++ )
		{
			sqr=i*i;

		}
		return (num+1)==sqr;
	}
}
