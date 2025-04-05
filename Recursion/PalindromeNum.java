import java.util.Scanner;
class PalindromeNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(reverse(num,0)==num?"It is Palindrome":"It is not Palindrome");
	}
	public static int reverse(int num,int rev)
	{
		if (num==0)
		{
			return rev;
		}
		rev=rev*10+(num%10);
		return reverse(num/10,rev);
	}
}
