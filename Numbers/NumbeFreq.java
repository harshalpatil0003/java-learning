import java.util.Scanner;
class NumbeFreq 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		long num=new Scanner(System.in).nextLong();
		System.out.println(num);
		for (int i=0;i<=9 ;i++ )
		{
			int cnt=0;
			for (long j=num;j>0 ;j/=10 )
			{
				long rem=j%10;
				if (i==rem)
				{
					cnt++;
				}

			}
			if (cnt!=0)
			{
				System.out.println(i+" : "+cnt);
			}
		}



	}
}
