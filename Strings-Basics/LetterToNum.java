import java.util.Scanner;
class  LetterToNum
{
	public static void main(String[] args) 
	{
		System.out.print("Enter String: ");
		String  str=new Scanner(System.in).next().toUpperCase();
		int len=str.length();
		if (len==1)
		{
			System.out.println(str.charAt(0)-64);
		}
		if (len==2)
		{
			System.out.println((str.charAt(0)-64)*26+str.charAt(1)-64);
		}
	}
}
