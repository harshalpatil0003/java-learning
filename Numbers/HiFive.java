import java.util.Scanner;
class  HiFive
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();

		String op=(num%5==0&&num%2==0)?("HiTwo HiFive"):((num%2==0)?("HiTwo"):((num%5==0)?("HiFive"):(" ")));
		System.out.println(op);


	}
}
