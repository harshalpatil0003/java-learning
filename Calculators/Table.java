import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num=new Scanner(System.in).nextInt();

		System.out.print("Enter the range: ");
		int range=new Scanner(System.in).nextInt();

		for (int i=1;i<=range ;i++ )
		{
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
}
