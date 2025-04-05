import java.util.Scanner;
class HappySadNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.print(isHappSad(num)==true?"it is Happy Number": "It is Sad Number");
	}
	public static boolean isHappSad(int num)
	{
		int sum=sumOfSquars(num);
		while(sum!=4 && sum!=1)
		{
			sum=sumOfSquars(sum);
		}
		return sum==1?true:false;
	}
	public static int sumOfSquars(int num)
	{
		int sum=0;
		for (int i=num;i>0 ;i/=10 )
		{
			int rem =i%10;
			sum+=(rem*rem);
		}
		return sum;
	}
}
