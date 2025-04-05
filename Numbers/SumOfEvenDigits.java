import java.util.Scanner;
class SumOfEvenDigits 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int dup=num;
		int evensum=0,oddsum=0;
		while (num>0)
		{
			int rem=num%10;
			if(rem%2==0){
				evensum+=rem;
			}
			else if(rem%2!=0)
			{
				oddsum+=rem;
			}
			num/=10;
		}
		System.out.println("Sum of all even digits in a number "+dup +" is "+ evensum);
		System.out.println("Sum of all odd digits in a number "+dup +" is "+ oddsum);

	}
}
