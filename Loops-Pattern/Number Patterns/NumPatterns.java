class NumPatterns 
{
	public static void main(String[] args) 
	{
		int n=5;
		{
			for (int i=1;i<=n ; i++)
			{
				for (int j=1;j<=i;j++ )
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
		System.out.println();
		{
			for (int i=1; i<=n;i++ )
			{
				for (int j=1;j<=i ;j++ )
				{
					System.out.print((i*j)+" ");
				}
				System.out.println();
			}
		}
		System.out.println();
		{
			int a=1;
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=i ;j++ )
				{
					System.out.print(a++ +" ");
				}
				System.out.println();
			}
			
		}
		System.out.println();
		{
			char ch='a';
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=i ;j++ )
				{
					System.out.print(ch++ +" ");
				}
				System.out.println();
			}
		}
			System.out.println();
		{
			for (int i=1;i<=n ;i++ )
			{
				char ch='a';
				for (int j=1;j<=i ;j++ )
				{
					System.out.print(ch++ +" ");
				}
				System.out.println();
			}
		}
		System.out.println();
		{
			int a=0;
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=i ;j++ )
				{
					System.out.print((a+=2)+" ");
				}
				System.out.println();
			}
		}
		System.out.println();
		{
			int a=1;
			char ch='a';
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=i ;j++ )
				{
					System.out.print((a++)+" ");
				}
				for (int j=2;j<=i ;j++ )
				{
					System.out.print((ch++)+" ");
				}
					System.out.println();
			}
		}
			System.out.println();
		{
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=i ;j++ )
				{
					if ((i+j)%2==0)
						System.out.print("1 ");
					else
						System.out.print("0 ");
					
				}
				
					System.out.println();
			}
		}
	}
}
