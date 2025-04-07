class Form1Driver 
{
	public static void main(String[] args) 
	{

		Form1 f1=new Form1("Jay",45689875,'M',"01/12/2000");
		f1.displayForm();
		System.out.println("-------------------");

		Form1 f2=new Form1("Harsh",45665455,'M',"15/03/2003",45656122);
		f2.displayForm();
		System.out.println("-------------------");
		
		Form1 f3=new Form1("Harsh",45665455,'M',"15/03/2003",45656122,"harshgmail.com");
		f3.displayForm();
		System.out.println("-------------------");

		Form1 f4=new Form1("Harsh",45665455,'M',"15/03/2003",45656122,"harsh@gmail.com","B+");
		f4.displayForm();
		System.out.println("-------------------");
	}
}
