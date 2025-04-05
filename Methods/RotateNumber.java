import java.util.Scanner;
class RotateNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int ct=cnt(num);
		int rot=rotate(num);
		do
		{
			System.out.println(rot);
			rot=rotate(rot);
			ct--;
		}
		while (ct>0);
	}
	public static int cnt(int num)
	{
		int cnt=0;
		for (int i=num; i>0;i/=10 )
		{
			cnt++;
		}
		return cnt;
	}
	public static int power(int num, int cnt)
	{
		int pow=1;
		for (int i=1;i<=cnt ;i++ )
		{
			pow*=num;
		}
		return pow;
	}

	public static int rotate(int num)
	{
		int rem=num%10;
		return rem*power(10,(cnt(num)-1))+(num/=10);
	}
}
