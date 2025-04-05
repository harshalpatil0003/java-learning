import java.util.Scanner;
class  Result
{
	public static void main(String[] args) 
	{
		System.out.print("Enter marks: ");
		float marks=new Scanner(System.in).nextFloat();

		float result=(marks/600f)*100f;

		//String op=(result>=35)?((result>=75)?("A"):((result>=60&&result<=75)?("B"):((result>=35&&result<=60)?("C"):(" ")))):("you are failed");
		String op=(marks<100 ||	marks>600)?("Invalid marks entered."):
			((result<35)?("You are failed "):
			((result>=75)?("Pass! Your result is "+result+" With grade A" ):
			((result>=60)?("Pass! Your result is "+result+" With grade B"):
			((result>=35)?("Pass! Your result is "+result+" With grade C"):("")))));

		System.out.print(op);
	}
}
