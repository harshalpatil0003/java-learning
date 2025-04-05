class Car 
{
	String brand;
	String model;
	double price;
	int cc;
	double mileage;

	public void showCars()
	{
		//String brand="Chapri";
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		System.out.println("CC: "+cc);
		System.out.println("Mileage: "+mileage);
		System.out.println(this);

	}
}
