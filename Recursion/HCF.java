import java.util.Scanner;
class HCF 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number N1: ");
		int num1=new Scanner(System.in).nextInt();
		System.out.print("Enter Number N2: ");
		int num2=new Scanner(System.in).nextInt();
		System.out.print(hcf(num1,num2));
	}
	public static int hcf(int n1,int n2)
	{
		int small=n1<n2?n1:n2;
		
		while (true)
		{
			if (n1%small==0 && n2%small==0)
			{
				return small;
			}
			small--;
		}
	}
}
