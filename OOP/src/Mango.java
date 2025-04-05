class Mango 
{

	//method chaining
	String type;
	String origin;
	double price;

	public Mango displayType()
	{
		System.out.println("Type: "+type);
		return this;
	}
	public Mango displayOrigin()
	{
		System.out.println("Origin: "+origin);
		return this;
	}
	public Mango displayPrice()
	{
		System.out.println("Price: "+price);
		return this;
	}
}
