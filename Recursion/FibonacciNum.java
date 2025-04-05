import java.util.Scanner;
class FibonacciNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Range Of nth Fibonacci: ");
		int rng=new Scanner(System.in).nextInt();
		fibonacci(0,1,rng);

	}
	public static void fibonacci(int n1,int n2,int rng)
	{
		if (rng>0)
		{
			int n3=n1+n2;
			System.out.print(n1+" ");
			fibonacci(n2,n3,--rng);
		}
		return ;


	}
}
