import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number or String : ");
		String num=sc.next();
		int len=num.length();
		char a=0,b=0;
		for (int i=0;i<=len-1; i++)
		{
			a=num.charAt(i);
			System.out.print(a);

		}
			System.out.print(" -> ");
		for (int j=len-1;j>=0 ;j-- )
		{
			b=num.charAt(j);
			System.out.print(b);
		}
			System.out.println("");
		if (a==b)
		{
			System.out.println("String is palindrome.");
		}
		else{
			System.out.println("String is not palindrome.");
		}
	}

}
