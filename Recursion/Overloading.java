class  Overloading
{
 
	static{
		System.out.println(add(30,10));
	}
	public static void main(String[] args) 
	{
		add(20,30);
		add(50,20,30);
	}
	public static int add(int a, float b, int c)
	{
		return a+b+c;
	}
	public static int add(float a, float b)
	{
		return a+b;

	}
}
