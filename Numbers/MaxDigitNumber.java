import java.util.Scanner;
class MaxDigitNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num =new Scanner(System.in).nextInt();
		int max=0;
		int min=9;
		for (int i=num;i>0 ;i/=10 )
		{
			int dgt=i%10;
			if (max<dgt)
				max=dgt;
			else if(min>dgt)
				min=dgt;
		}
		System.out.println("largest digit from "+num+ " is "+max);
		System.out.println("Smallest digit from "+num+ " is "+min);
	}
}
