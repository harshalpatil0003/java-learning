import java.util.Scanner;
class Perimeter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Width: ");
		float width=sc.nextFloat();
		System.out.print("Enter Height: ");
		float height=sc.nextFloat();

		float area=width*height;
		float perimeter=2*(width+height);

		System.out.println("Area of rectangle is: "+area+" cm^2");
		System.out.println("Perimeter of rectangle is: "+perimeter+" cm");
		
	}
}
