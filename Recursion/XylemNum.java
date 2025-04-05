import java.util.Scanner;
class XylemNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(isXylem(num)?"It is Xylem Number":"It is Phloem Number");

	}
	public static boolean isXylem(int num)
	{
		int ExtSum=num%10;
		num/=10;
		int MidSum=0;
		while (num>9)
		{
			MidSum+=(num%10);
			num/=10;
		}
		ExtSum+=num;
		return ExtSum==MidSum;
	}
}
