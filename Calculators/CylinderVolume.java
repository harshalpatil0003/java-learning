import java.util.Scanner;
class  CylinderVolume
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius of cylinder: ");
		float radius=sc.nextFloat();

		System.out.print("Enter length of cylinder: ");
		float length=sc.nextFloat();
        final float pi=22/7f;

		float area=pi*(radius*radius);
		float volume=area*length;

		System.out.println("Area of cylinder:"+area+" cm^2");
		System.out.println("Volume Of Cylinder:"+volume+" cm^2");

	}
}
