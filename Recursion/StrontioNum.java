import java.util.Scanner;
class StrontioNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(isStrontio(num)?"It is Strontium Number":"It is not Strontium Number");
	}
	public static boolean isStrontio(int num)
	{
		int pro=num*2;
		int rem1=(pro%100)/10;
		int rem2=(pro%1000)/100;
		return rem1==rem2;
	}
}
