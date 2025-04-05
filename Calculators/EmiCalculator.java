import java.util.Scanner;
class EmiCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("   EMI calculator   ");
		System.out.print("Enter amount: ");
		float amt=sc.nextFloat();

		System.out.print("Enter ROI: ");
		float roi=sc.nextFloat();

		System.out.print("Enter Tenure (month): ");
		int month=sc.nextInt();

		//String str=(month/12)+"."+(month%12);
		//float year=Float.parseFloat(str);

		System.out.println("Principal Amount: "+amt+" rs");
		System.out.println("Rate of Interest: "+roi+" %");
		System.out.println("Tenure:"+month+" months");
		
		float interest=(amt*roi)/100f;
		System.out.println("Interest on principal amount: "+interest+" rs");

		float totalAmt=(interest)+amt;
		System.out.println("Total amount with interest:"+totalAmt+" rs");

		float emi=totalAmt/month;
		System.out.println("EMI for total amount: "+emi+" rs");
	}
}
