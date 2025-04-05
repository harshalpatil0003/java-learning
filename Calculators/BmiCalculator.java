import java.util.Scanner;
class BmiCalculator 
{
	public static void main(String[] args) 
	{

		System.out.print("Enter Weight (pounds):");
		float weight=new Scanner(System.in).nextFloat();
			
		System.out.print("Enter height in (inches):");
		float height=new Scanner(System.in).nextFloat();

		float kgwt=weight*0.45359237f;
		float mhei=height*0.0254f;

		float bmi=kgwt/(mhei*mhei);

		System.out.println("Your BMI is :"+bmi);



	}
}
