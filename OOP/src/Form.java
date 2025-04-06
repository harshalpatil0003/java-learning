class  Form
{
	//Constructor Overloading
	String name;
	long phno;
	long tel;
	char gen;
	String blood;
	String email;
	String dob;

	Form(){
		System.out.println("From Constructor 1 ");
	}
	Form(String name,long phno,char gen,String dob)
	{
		System.out.println("From Constructor 2");
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;
	}

	Form(String name,long phno,char gen, String dob, String blood)
	{
		System.out.println("From Constructor 3");
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;

		this.blood=blood;
	}
	Form(String name,long phno, char gen, String dob, String blood, long tel)
	{
		System.out.println("From Constructor 4");
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;
		
		this.blood=blood;
		this.tel=tel;
	}
	Form(String name, long phno,char gen,String dob,String blood,long tel,String email)
	{
		System.out.println("From Constructor 5");
		this.name=name;
		this.phno=phno;
		this.gen=gen;
		this.dob=dob;
		
		this.blood=blood;
		this.tel=tel;
		this.email=email;
	}

	public void DisplayForm()
	{
		System.out.println("Name: "+name);
		System.out.println("Phone: "+phno);
		System.out.println("Gender: "+gen);
		System.out.println("DOB: "+dob);
		System.out.println("Blood: "+blood);
		System.out.println("Tel NO: "+tel);
		System.out.println("Email: "+email);



	}
	

}
