import java.util.Scanner;
class  CurrencyConverter
{
	public static void main(String[] args) 
	{
		System.out.println("       * Currency Converter *     ");
		System.out.print("Enter amount in (INR): ");
		float inr=new Scanner(System.in).nextFloat();

		System.out.println("     Currency List    ");

		System.out.println("1. United States Dollar");
		System.out.println("USD");

		System.out.println("2. EURO");
		System.out.println("EURO");

		System.out.println("3. Kuwaiti Dinar");
		System.out.println("KWD");

		System.out.println("4. Chinese Yuan");
		System.out.println("CNY");

		System.out.println("5. Russian Ruble");
		System.out.println("RUB");

		System.out.println("6. Japanese Yen");
		System.out.println("JPY");
		System.out.print("");
		System.out.print("");

		System.out.print("Choose option: ");
		String opt=new Scanner(System.in).next().toUpperCase();
		
		float convert=0;
		
		 if(opt.equals("USD")){
			 convert=inr/86.56f;
			System.out.println(inr+" INR= "+convert+" USD");
		 }
		 else if(opt.equals("EURO")){
			convert=inr/90.22f;
			System.out.println(inr+" INR= "+convert+" EURO");

		 }
		  else if(opt.equals("KWD")){
			convert=inr/280.76f;
			System.out.println(inr+" INR= "+convert+" KWD");

		 }
		 else if(opt.equals("CNY")){
			convert=inr/11.94f;
			System.out.println(inr+" INR= "+convert+" CNY");

		 }
		 else if(opt.equals("RUB")){
			convert=inr/0.88f;
			System.out.println(inr+" INR= "+convert+" RUB");

		 }
		 else if(opt.equals("JPY")){
			convert=inr/0.56f;
			System.out.println(inr+" INR= "+convert+" JPY");

		 }
		  else {
			System.out.println("Invalid option");
		 }
	}
}
