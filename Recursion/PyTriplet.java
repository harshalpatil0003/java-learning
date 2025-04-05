import java.util.Scanner;
class PyTriplet 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n1: ");		
		int n1=sc.nextInt();
		System.out.print("Enter n2: ");
		int n2=sc.nextInt();
		System.out.print("Enter n3: ");
		int n3=sc.nextInt();
		System.out.print(isTriplet(n1,n2,n3));
	}
	public static boolean isTriplet(int n1,int n2,int n3 )
	{
		return (n3*n3)==(n1*n1)+(n2*n2);
	}
}
