import java.util.Scanner;
class TechNo 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
	    System.out.print(split(num)==num?"it is tech number":" it is not tech number");

	}
	public static int cnt(int num)
	{
		int ct=0;
		for (int i=num;i>0 ;i/= 10)
		{
			ct++;
		}
		return ct;
	}
	public static int split(int num)
	{
		int sum=0;
		if(cnt(num)%2==0){
			int div=1;
			for (int i=1;i<=(cnt(num)/2) ;i++ )
			{
				div*=10;
				sum=(num/div)+(num%div);
			}
		}
		return sum*sum;
	}

}
