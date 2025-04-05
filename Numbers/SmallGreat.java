import java.util.Scanner;
class  SmallGreat
{
	public static void main(String[] args) 
	{
		System.out.print("Enter num1: ");
		float num1=new Scanner(System.in).nextFloat();

		System.out.print("Enter num2: ");
		float num2=new Scanner(System.in).nextFloat();

		System.out.print("Enter num3: ");
		float num3=new Scanner(System.in).nextFloat();

		System.out.print("Enter num4: ");
		float num4=new Scanner(System.in).nextFloat();



		//For four digit number.


		float lar=(num1>num2)?((num1>num3)?(num1):((num3>num4)?(num3):(num4))):((num2>num3)?(num2):((num3>num4)?(num3):(num4)));
		float small=(num1<num2)?((num1<num3)?(num1):((num3<num4)?(num3):(num4))):((num2<num3)?(num2):((num3<num4)?(num3):(num4)));

		// For 3 digit number.
		//float lar=(num1>num2)?((num1>num3)?(num1):(num3)):((num2>num3)?(num2):(num3));
		//float small=(num1<num2)?((num1<num3)?(num1):(num3)):((num2<num3)?(num2):(num3));
		System.out.println("Larger Number Is: "+lar);
		System.out.println("Smaller Number Is: "+small);


	}
}
