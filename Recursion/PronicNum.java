import java.util.Scanner;
class PronicNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.println(isPronic(num,0)?"It is pronic number": "It is not pronic number");
	}
	public static boolean isPronic(int num,int p)
	{
			if (p*(p+1)==num)
			{
				return true;
			}
			else if(p*(p+1)>num)
			{
				return false;
			}
			return isPronic(num,++p);
	}
}
