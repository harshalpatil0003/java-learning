import java.util.Scanner;
public class factorial
{
    public static void main(String[] args)
	{
        System.out.print("Enter a number: ");
		int num=new Scanner(System.in).nextInt();
		System.out.println(fact(num));
    }
	public static int fact(int num)
	{
		if (num==0)
		{
			return 1;
		}
		return num*fact(num-1);
	}
	
}