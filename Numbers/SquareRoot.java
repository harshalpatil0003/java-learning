import java.util.Scanner;
class SquareRoot 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		boolean flag=false;
		for (int i=1;i<=num;i++ )
		{
			//if(num/i==i)
		    if(i*i==num){
			//(Math.sqrt(n))
				flag=true;
				System.out.println("Square root of "+num+" is "+i);
			}
			if(i*i>num)
				break;
		}
		if (!flag)
		{
			System.out.println(num+" does not have perfect squareroot");
		}
	}
}
