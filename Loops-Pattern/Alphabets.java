class Alphabets
{
	public static void main(String[] args) 
	{
		int n=5;
		{
			for (int i=0; i<n; i++)
			{
				for (int j=0; j<n;j++ )
				{
					if ( j==0||i==0||j==4||i==n/2)
					{
						System.out.print("*"+" ");
					}
					else{
						System.out.print(" "+" ");
					}
				}
				System.out.println();
			}
		}
						System.out.println();

		{
			for (int i=0; i<n; i++)
			{
				for (int j=0; j<n;j++ )
				{
					if ( j==0||i==0||j==4||i==n/2||i==n-1)
					{
						System.out.print("*"+" ");
					}
					else{
						System.out.print(" "+" ");
					}
				}
				System.out.println();
			}
		}
						System.out.println();

		{
			for (int i=1; i<=n; i++)
			{
				for (int j=1; j<=n;j++ )
				{
					if ( j==1||i==1||i==n)
					{
						System.out.print("*"+" ");
					}
					else{
						System.out.print(" "+" ");
					}
				}
				System.out.println();
			}
		}
						System.out.println();

		{
			for (int i=0; i<n; i++)
			{
				for (int j=0; j<n;j++ )
				{
					if (i==1||i==n||j==n)
					{
						System.out.print("*"+" ");
					}
					else{
						System.out.print(" "+" ");
					}
				}
				System.out.println();
			}
		}

	}
}
