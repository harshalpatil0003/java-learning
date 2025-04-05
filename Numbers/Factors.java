import java.util.Scanner;
class Factors 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number: ");
		int num=new Scanner(System.in).nextInt();
		int cnt=0;
		for (int i=1;i<=num ;i++ )
		{
			if(num%i==0){
				cnt++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Count: "+cnt);
	}
}
