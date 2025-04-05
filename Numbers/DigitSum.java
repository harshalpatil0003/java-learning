import java.util.Scanner;
class  DigitSum
{
	public static void main(String[] args) 
	{

		System.out.print("Enter number from (0-1000): ");
		int num=new Scanner(System.in).nextInt();
		int dup=num;
		int sum=0;
		num=num>0?num:000;
		num=num<=1000?num:000;

		int newNum=num%10;
		 sum=newNum+sum;
		 num=num/10;

		 newNum=num%10;
		 sum=newNum+sum;	
		 num=num/10;

		 newNum=num%10;
		 sum=newNum+sum;
		 num=num/10;

		 newNum=num%10;
		 sum=newNum+sum;

		System.out.println("Sum of digits in number "+dup+" is "+sum);
	}
}
