package PrinciplesOfoOops.Pen;
import java.util.Scanner;
public class Pen {
	String brand;
	String type;
	double price;
	Refill ref;
	

//	1] Refill ref= new Refill("Red","Ball",0.5);
//we can achieve early binding with this way also.
//	{
//	2]	Scanner sc=new Scanner(System.in);
//		
//		System.out.print("Enter Refill color: ");
//		String color=sc.next();
//		
//		sc.nextLine();
//		System.out.print("Enter type of refill: ");
//		String type=sc.nextLine();
//		
//		System.out.print("Enter size of refill: ");
//		double size=sc.nextDouble();
//		
//		ref =new Refill(color,type,size)	;	
//	}
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	public Pen(String brand,String type,double price,String color,String refilltype,double size) {
		//3] This is 3rd way to add values 
		ref=new Refill(color,refilltype,size);
		this.brand=brand;
		this.type=type;
		this.price=price;
	}
	
	public void displayPen() {
		System.out.println("Brand: "+brand );
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
	}

}
