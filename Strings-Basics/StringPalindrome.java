import java.util.Scanner;
class StringPalindrome 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter String: ");
		String str=new Scanner(System.in).next();
		String rev="";
		for (int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if (str.equals(rev))
		{
			System.out.print("String is palindrome");
		}
		else {
			System.out.print("String is not palindrome");
		}
	}
}
