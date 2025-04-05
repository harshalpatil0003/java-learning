import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter value: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print("Enter Power: ");
		int pow=new Scanner(System.in).nextInt();
		int op=1;
		for (int i=1;i<=pow ;i++ )
		{
			op*=num;
		}
		System.out.println(num+" ^ "+ pow+" = "+op);
		System.out.println(num+" ^ "+ pow+" = "+ (int)Math.pow(num,pow));//num^pow = Math.pow(num,pow)

	}
}
