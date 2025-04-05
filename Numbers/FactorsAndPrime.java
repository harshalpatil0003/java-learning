import java.util.Scanner;
class FactorsAndPrime 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int cnt=0;
		for (int i=2; i<num;i++)
		{
			if (num%i==0)//same logic is used to find factor.
			{
				cnt++;
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println(cnt+" count");
		System.out.println((cnt==0)?(num+" is prime"): (num+" is not prime"));
	}
}
