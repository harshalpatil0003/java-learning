class  Series5
{
	public static void main(String[] args) 
	{
		int n=43;
		boolean flag=true;
		int cnt=0;
		for (int i=1;i<=n ; i++)
		{
			if (n%i==0)
			{
				flag=false;
				break;
			}
		}
		if (flag)
		{
			System.out.print(cnt++);
		}

	
	}
}
