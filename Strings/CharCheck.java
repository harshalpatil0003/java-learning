import java.util.Scanner;
class CharCheck 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Chaeracter: ");
		char ch=new Scanner(System.in).next().charAt(0);

		String op=(ch>='A'&& ch<='Z'|| ch>='a'&& ch<='z')?((ch>='a'&&ch<='z')?(ch+ " is a Lowercase alphabet"):(ch+ " is a Usppercase alphabet")):
			((ch>='0'&& ch<='9')?(ch+" is aDigit."):(ch+ " is a special character."));
		System.out.print(op);

	}
}
