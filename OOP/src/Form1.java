class  Form1
{
	String name;
	long phno;
	char gen;
	String dob;
	long tel;
	String email;
	String blood;

	Form1(){}

	Form1(String name,long phno,char gen,String dob)
	{
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;
	}
	Form1(String name,long phno,char gen,String dob,long tel)
	{
		this(name,phno,gen,dob);
		this.tel=tel;
	}

	Form1(String name,long phno,char gen,String dob,long tel,String email)
	{
		this(name,phno,gen,dob,tel);
		this.email=email;
	}

	Form1(String name,long phno,char gen, String dob,long tel,String email,String blood)
	{
		this(name,phno,gen,dob,tel,email);
		this.blood=blood;
	}

	public void displayForm()
	{
		System.out.println("Name :"+name);
		System.out.println("Phno :"+phno);
		System.out.println("Gender :"+gen);
		System.out.println("DOB :"+dob);
		System.out.println("TEL :"+tel);
		System.out.println("Email :"+email);		
		System.out.println("Blood: "+blood);
	}
	
}
