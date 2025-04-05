class Ramanujan
{
	public static void main(String[] args) 
	{

		System.out.println(rama(1729)?"Ramanujan Number":"Not Ramanujan Number");

	}
	public static boolean rama(int num)
	{
		
		int ct=0;
		for (int i=1;i*i*i<num; i++)
		{
			for (int j=i+1;i*i*i+j*j*j<=num;j++ )
			{
				if (i*i*i+j*j*j==num)
				{
					ct++;
					if (ct==2)
					{
						return true;
					}

				}
			}
		
		}
		return false;
	}
}
