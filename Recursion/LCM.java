import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number N1: ");
		int num1=new Scanner(System.in).nextInt();
		System.out.print("Enter Number N2: ");
		int num2=new Scanner(System.in).nextInt();
		System.out.print(lcm(num1,num2));
	}
	public static int lcm(int n1,int n2)
	{
		int max=n1>n2?n1:n2;
		int i=1;
		while (true)
		{
			if ((max*i)%n1==0 && (max*i)%n2==0)
			{
				return max*i;
			}
		++i;		
		}
	}
}
