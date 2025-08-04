import java.util.Scanner;
class  IsDigit
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Character: ");
		char ch=new Scanner(System.in).next().charAt(0);

		System.out.print((ch>='0'&&ch<='9')?(ch+" is digit character."):(ch+ " is not digit character."));
	}
}
