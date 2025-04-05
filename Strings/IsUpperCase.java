import java.util.Scanner;
class  IsUpperCase
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Character: ");
		char ch=new Scanner(System.in).next().charAt(0);

		System.out.print((ch>='A'&&ch<='Z')?(ch+" is uppercase character."):(ch+ " is not uppercase character."));
	}
}
