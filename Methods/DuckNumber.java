import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		String str=new Scanner(System.in).next();
		System.out.print(duck(str)?"it is duck number":"not duck number");
	}
	public static boolean duck(String str)
	{
		return (str.contains("0") && (str.charAt(0)!='0'));
	}
}