import java.util.Scanner;
class RandomOtp 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter how much otp you want: ");
		int num=new Scanner(System.in).nextInt();

		String otp="";
		for (int i=1;i<=num ;i++)
		{
			otp+=(int)(Math.random()*1000000);
				if (otp.length()==6)
				{
					System.out.println(otp);
					
				}
				else{
					i--;
				}
				otp="";
		}

	}
}
