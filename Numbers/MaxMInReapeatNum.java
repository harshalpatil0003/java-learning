import java.util.Scanner;
class MaxMinReapeatNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		long num=new Scanner(System.in).nextLong();
		System.out.println(num);
		int mxdgt=0, mndgt=0,max=0,min=9;
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
				if (max<cnt)
				{
					max=cnt;
					mxdgt=i;
				}
				else if (min>cnt)
				{
					min=cnt;
					mndgt=i;
				}
			}
		}

		System.out.println("Max digit is "+mxdgt+" with a frequency of "+max);
		System.out.println("Min digit is "+mndgt+" with a frequency of "+min);

	}
}
