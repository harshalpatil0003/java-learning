import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int dup=num;
		int sum1=0,sum2=0;
		while (num>0)
		{
			int rem=num%10;
			int sumfact=1,oddfact=1;
			if (rem%2==1)
			{
				for (int i=1;i<=rem ;i++ )
				{
					sumfact*=i;

				}
				sum1+=sumfact;
			}
			else if(rem%2==0){
				for (int i=1;i<=rem ;i++ )
				{
					oddfact*=i;

				}
				sum2+=oddfact;
			}
			num/=10;
		}
		System.out.println("Sum of factorial of odd digits in a number "+dup+" is "+sum1);
		System.out.println("Sum of factorial of even digits in a number "+dup+" is "+sum2);

	}
}
