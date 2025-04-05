import java.util.Scanner;
class Fibonacci 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter range: ");
		int n=new Scanner(System.in).nextInt();

		for (int i=0; i<=n; i++)
		{
			if(n==0 && n==1 ){
				System.out.print(n);
			}
		}
	}
}
