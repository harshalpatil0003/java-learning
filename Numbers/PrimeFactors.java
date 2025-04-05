import java.util.Scanner;
class PrimeFactors 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int dm;
		for (int i=2;i<=num ;i++ )
		{
			if (num%i==0)
			{
				dm=2;
				while(dm<i){
					if (i%dm==0)
					{
						break;
					}
					dm++;
				}
				if (dm==i)
				{
					System.out.println(i+"");
				}

			}
		}
	}
}
