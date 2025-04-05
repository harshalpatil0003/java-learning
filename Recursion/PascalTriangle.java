class PascalTriangle 
{
	public static void main(String[] args) 
	{

		for (int i=0;i<6 ;i++ )
		{
			for (int j=0;j<6 ;j++ )
			{
				if(j<6-i-1)
				System.out.print(" "+" ");
			}
			for (int j=0;j<=i ; j++)
			{
				System.out.print(fct(i)/(fct(i-j)*fct(j))+" " +"  ");
			}
			
			System.out.println();
		}
	}
	public static int fct(int num)
	{
		int fact=1;
		for (int i=num;i>0 ;i-- )
		{
			fact*=i;
		}
		return fact;
	}
}
