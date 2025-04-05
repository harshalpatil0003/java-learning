import java.util.Scanner;
class MakeEvenOdd 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int len=0;
		int dup=num;
		while(num>0)
		{
			len+=1;
			num/=10;
		}
		String newNum="";
			System.out.println("len :"+len);
		if(len%2==0)
		{	
			System.out.println("Even length");
			for (int i=dup;i>=1 ;i/=10)
			{
				int rem=i%10;
				if (rem%2==0)
				{
					newNum=rem+newNum;
				}
				else{
					rem+=1;	
					newNum=rem+newNum;
				}
			}	
		}
		else if(len%2!=0)
		{	System.out.println("odd length");
			for (int i=dup;i>=1 ;i/=10)
			{
				int rem=i%10;
				if (rem%2!=0)
				{
					newNum=rem+newNum;
				}
				else{
					rem+=1;	
					newNum=rem+newNum;
				}
				
			}
		}
		
		
	System.out.println(dup+" : "+newNum);
	}
}
