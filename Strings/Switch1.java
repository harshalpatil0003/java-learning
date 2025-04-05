import java.util.Scanner;
class  Switch1
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Month: ");
		int opt=new Scanner(System.in).nextInt();

	if(opt>=1 && opt<=12){
		switch (opt)
		{
		case 10:		
		case 11:		
		case 12:		
		case 1:{
			System.out.println("October");
			System.out.println("November");
			System.out.println("December");
			System.out.println("January");
			System.out.println("Winter");
			break;
		}
		case 2:		
		case 3:		
		case 4:		
		case 5:{
			System.out.println("February");
			System.out.println("March");
			System.out.println("April");
			System.out.println("May");
			System.out.println("Summer");
			break;
		}
		case 6:		
		case 7:		
		case 8:		
		case 9:{
			System.out.println("June");
			System.out.println("July");
			System.out.println("August");
			System.out.println("September");
			System.out.println("Monsoon");
			break;
		}
		}
	}
	else{
		System.out.println("Invalid Input");
	}


	}
}
