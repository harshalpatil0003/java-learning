import java.util.Scanner;
class NumPalindrome
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner( System.in).nextInt();
		int rev=0;
		int dup=num;
		while (num>0 )
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if (rev==dup)
		{
			System.out.println(dup+" is palindrome.");
		}
		else{
			System.out.println(dup+" is not palindrome.");

			}
	}
}
