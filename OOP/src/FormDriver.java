class FormDriver 
{
	public static void main(String[] args) 
	{
		Form f1=new Form();
		f1.DisplayForm();
		System.out.println("---------------------");

		Form f2=new Form("Harsh",879898878,'M',"15/03/2003");
		f2.DisplayForm();
		System.out.println("---------------------");

		Form f3=new Form("Jay",123456,'M',"1/1/2000","B+",456123,"jay@gmial.com");
		f3.DisplayForm();
		System.out.println("---------------------");

	}
}
