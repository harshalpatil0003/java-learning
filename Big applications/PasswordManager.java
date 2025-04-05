import java.util.Scanner;
class PasswordManager 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		int seconds=5000;
		int storedpin=1234;

		outerloop:
		for (; ; )
		{
			int attempt=3;
			do
			{

				System.out.print("Enter pin: ");
				int pin=sc.nextInt();
				if (storedpin==pin)
				{
					System.out.println("Phone unlocked ");
					break outerloop;
				}
				else{
					System.out.println("Wrong pin ");
					System.out.println("Attempts left "+(attempt-1));
				}
				attempt--;

			}
			while (attempt>=1);
			System.out.println();
			System.out.print("Phone is disabled for "+(seconds/1000)+" seconds");
				Thread.sleep(seconds);
				seconds*=2;
			System.out.println();
		}


	}
}
