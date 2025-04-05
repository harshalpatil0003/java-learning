import java.util.Scanner;
class vowelConsonent 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Alphabet: ");
		char ch=new Scanner(System.in).next().charAt(0);

		String op=(ch==s'e'||ch=='a'||ch=='i'||ch=='o'||ch=='u')?(ch+" is vowel"):(ch+" is consonent");
				System.out.println(op);

	}
}
