import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number: ");
		int num=new Scanner(System.in).nextInt();
		if (num%7==0 ||num%10==7)
			System.out.println(num+" is buzz number");
		else
			System.out.println(num+" is not buzz number");
	}
}
