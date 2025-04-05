import java.util.Scanner;
class ISBNNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		long num =new Scanner(System.in).nextLong();
		long sum=0;
		long dup=num;

		for (long i=1,j=1;i<=num;num/=10,j++ )
		{
			long rem=num%10;
			sum+=(rem*j);
		}
		
		if (sum%11==0)
		{
			System.out.println(dup+" is valid ISBN number");
		}
		else
			System.out.println(dup+" is not valid ISBN number");
	}
}
