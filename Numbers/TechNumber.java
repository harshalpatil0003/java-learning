import java.util.Scanner;
class TechNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int dup=num;
		int div=1;
		int sum=0;
		int cnt=0;
		while (num>0)
		{
			num/=10;
			cnt++;
		}
		if (cnt%2!=0)
		{
			System.out.println("It is not tech number");
		}
		else{
			for (int i=1;i<=cnt/2 ;i++ )
			{
				div*=10;
			}
			sum=(dup/div)+(dup%div);
			int sqr=sum*sum;
			System.out.println(sqr==dup?dup+" is tech number":dup+" is not tech number");

		}

	}
}
