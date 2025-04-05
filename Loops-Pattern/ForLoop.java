class ForLoop 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++){
			System.out.print(i+" ");

		}
			System.out.println(" ");

		for (char ch='A';ch<='Z' ;ch++ )
		{
			System.out.print(ch+" ");
		}

		System.out.println(" ");
		for (char ch='z';ch>='a' ;ch-- )
		{
		System.out.print(ch+" ");
		}

		System.out.println(" ");
		for (char ch='0';ch<='9' ;ch++ )
		{
		System.out.print(ch+" ");
		}

		System.out.println(" ");
		for (char ch=1;ch<=127 ;ch++ )
		{
		System.out.println(((int)ch)+" : "+ch+"  ");
		}
			

	}
}
