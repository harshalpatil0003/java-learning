import java.util.Scanner;
class NextPrevPrime 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int prev=0, next=0;
		for (int i=num-1;i>=2 ;i-- )
		{
			boolean flag=true;
			for (int j=2;j<i ;j++ )
			{
				if (i%j==0){
				flag=false;
				break;
				}
			}
			if (flag)
			{
				prev=i;
				break;
			}
		
		}
		for (int i=num+1; ;i++ )
		{
			boolean flag=true;
			for (int j=2;j<i ;j++ )
			{
				if (i%j==0){
				flag=false;
				break;
				}
			}
			if (flag)
			{
				next=i;
				break;
			}
		}
		if (num-prev<next-num)
			System.out.println(prev+" "+num);
		else if (num-prev>next-num)
			System.out.println(num+" "+next);
		else
			System.out.println(prev+" "+num+" "+next);
	}
}
