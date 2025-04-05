import java.util.Scanner;
class Census 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long currPopu=312032486;
		final long seconds=(365*24*60*60)*5;
		long born=seconds/7;
		long death=seconds/13;
		long immigrant=seconds/45;

		long newpopu=currPopu+born-death+immigrant;

		System.out.println("Current Population is:"+currPopu);
		System.out.println("Population after Census:"+newpopu);

	}
}
