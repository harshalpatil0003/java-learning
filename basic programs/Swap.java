import java.util.Scanner;
class Swap 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Before Swapping");
		int a=sc.nextInt();
		System.out.println("a:"+a);	
		
		int b=sc.nextInt();
		System.out.println("b:"+b);
		int temp=b;
		b=a;
		a=temp;
        System.out.println("After Swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);

	}
}
