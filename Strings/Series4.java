class Series4 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int out=0;
		for (int i=1;i<=6 ;i++ )
		{	
			int fact=1;
			for (int j=i;j>=1 ;j-- )
			{
				fact*=j;
				out=sum+fact;

			}
			//System.out.println(fact);
			sum+=fact;
			System.out.print(out+" ");

		}
		}
	}
