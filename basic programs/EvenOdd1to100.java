class EvenOdd1to100
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=100 ;i++ )
		{
			if (i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
		for (int i=100;i>=1;i-- )
		{
			if (i%2==1)
			{
				System.out.print(i+" ");
			}
		}
	}
}
