import java .util.Scanner;
class MakeNoprime 

{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		for (int i=2;i<num ;i++ )
		{	
			if (num%i==0)
			{
				num++;
			}
		}
		System.out.println("num: "+ num);
	}
}
