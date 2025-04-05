class Series2 
{
	public static void main(String[] args) 
	{
		int num=2;

		int pow=1;
		for (int i=2,p=1;i<=5;i++,p*=2 )
		{
			System.out.print(i+" ");

			for (int j=1;j<p ;j++ )
			{
				pow*=2;

			}
		}
		
		System.out.println(pow);
	}
}
