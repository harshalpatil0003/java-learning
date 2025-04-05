import java.util.Scanner;
class FindEmirp 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int dup=num;
		int rev=0;
		int cnt1=0,cnt2=0;
		boolean flag=true;
		for (int i=2; i<num; i++)
		{
			if (num%i==0)
			{
				flag=false;
				cnt1++;
				System.out.println("Number is not prime number.");
				break;
			}
		}
		
		if (flag)
		{
			if (flag)
			{
				System.out.println(num+" is prime number");
				while (num>0)
				{
					int rem=num%10;
					rev=rev*10+rem;
					num/=10;
				}
				for (int i=2;i<rev ;i++ )
				{
					if (rev%i==0)
					{
						cnt2++;
						System.out.println(rev+" is not prime number");
						break;
					}
					else{
						System.out.println(rev+" is prime number");
						break;
					}

				}

			}
			if (cnt1==cnt2)
			{
				System.out.println(dup+" is emirf");
			}
			else{
				System.out.println(dup+" is not emirf");
			}
		}
	
	}
}
