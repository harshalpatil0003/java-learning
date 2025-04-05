class CarDriver 
{
	public static void main(String[] args) 
	{
		Car c1=new Car();
		//System.out.println(c1);
		c1.brand="Jaguar";
		c1.model="XF";
		c1.price=7800000.0;
		c1.cc=2179;
		c1.mileage=18;
		c1.showCars();
		System.out.println("----------------------------");
		
		Car c2=new Car();
		c2.brand="Audi";
		c2.model="A6";
		c2.price=7200000.0;
		c2.cc=1984;
		c2.mileage=14;
		c2.showCars();
		System.out.println("----------------------------");

		Car c3=new Car();
		c3.brand="Mercedes";
		c3.model="Benz C-Class";
		c3.price=6600000.0;
		c3.cc=1496;
		c3.mileage=17;
		c3.showCars();
		System.out.println("----------------------------");	
		Car c4=new Car();
		c4.brand="BMW";
		c4.model="XM";
		c4.price=20000000.6;
		c4.cc=4395;
		c4.mileage=62;
		c4.showCars();
		System.out.println("----------------------------");

	}
}
