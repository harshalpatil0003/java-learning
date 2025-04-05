import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int len=0,div=1;

		for (int i=num;i>0 ;i/=10 )
		{
			len++;
		}
		for (int i=1;i<=len ;i++ )
		{
			div*=10;
		}
		System.out.println(
			num==(num*num)%div?
			num+" is Automorphic number":
			num+" is not Automorphic number");
	}
}
