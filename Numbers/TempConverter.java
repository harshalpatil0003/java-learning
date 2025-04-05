import java.util.Scanner;
class TempConverter
{
	public static void main(String[] args) 
	{
		System.out.println(" ------TEMPERATURE CONVERTER-------  \n  ");
		
		System.out.print("Enter temperature in degree celcius: ");
		float degree=new Scanner(System.in).nextFloat();

		System.out.println("1. Fahrenheit");
		System.out.println("2. Kelvin ");
		System.out.println("3. Rankine");
		System.out.print("Choose Option: ");
		int opt=new Scanner(System.in).nextInt();
		float conv=0.0f;
		switch (opt)
		{
			case 1:{
				conv=(degree*9/5f)+32;
				System.out.println(degree+" Degree Celcius  ----> "+conv+" Fahrenheit");
				break;
			}
			case 2:{
				conv=degree+273.15f;
				System.out.println(degree+" Degree Celcius  ----> "+conv+" Kelvin");
				break;
			}	
			case 3:{
				conv=(degree*9/5f)+491.67f;
				System.out.println(degree+" Degree Celcius  ----> "+conv+" Rankine");
				break;
			}
			default :{
				System.out.println("Choose correct option ");
			}

		}
	}
}
