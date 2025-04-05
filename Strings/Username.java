import java.util.Scanner;
class  Username
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Username: ");
		String name=new Scanner(System.in).next();
		int len=name.length();

		for (int i=0;i<=len-1 ;i++ )
		{
			System.out.println(name.charAt(i));
		}
		
	}
}
