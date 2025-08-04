class Series3 
{
	public static void main(String[] args) 
	{
		for (int i=2; i<=6;i++ )
		{
			//System.out.println(i);
			int pow=1;
			for (int j=1;j<=3 ; j++)
			{
				pow*=i;
			}
			System.out.print(pow+i+" ");

		}
	}
}
