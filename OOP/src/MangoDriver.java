class  MangoDriver
{
	public static void main(String[] args) 
	{
		Mango m1=new Mango();
		m1.type="Hapus";
		m1.origin="Kolhapur";
		m1.price=2000.0;
		m1.displayOrigin().displayPrice().displayType();
	}
}
