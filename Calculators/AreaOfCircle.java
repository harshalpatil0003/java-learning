import java.util.Scanner;
class  AreaOfCircle
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter radius of circle in cm^2 : ");
		float r=sc.nextFloat();
		final float pi=22/7f;
		float area=pi*(r*r); 
		float perimeter=2*pi*r;
		System.out.println("Area of circle is:"+area+" cm^2");
		System.out.println("Perimeter of circle is:"+perimeter+" cm");

	}
}
