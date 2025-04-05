import java.util.Scanner;
class  Seasons
{

	public static void main(String[] args) 
	{
		System.out.print("Enter month: ");
		String ses=new Scanner(System.in).next().toUpperCase();

		String op=(ses.equals("OCT")||ses.equals("NOV")||ses.equals("DEC")||ses.equals("JAN"))?("Winter"):
					((ses.equals("FEB")||ses.equals("MAR")||ses.equals("APR")||ses.equals("MAY"))?("Summer"):
					((ses.equals("JUN")||ses.equals("JUL")||ses.equals("AUG")||ses.equals("SEP"))?("monsoon"):(" ")));
		System.out.print(op);
 
	}
}
