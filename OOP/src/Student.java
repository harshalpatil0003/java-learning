class Student 
{
	String name;
	int roll;
	String degree;
	String coll;
	int age;
	
			{
		System.out.println("harshal");
	}

	Student(){
		System.out.println("from constructor 1");
	}
	Student(String name,int roll,String degree, String coll,int age)
	{
		this.name=name;
		this.age=age;
		this.coll=coll;
		this.degree=degree;
		this.roll=roll;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Coll: "+coll);
		System.out.println("Degree: "+degree);
		System.out.println("Roll: "+roll);
	}
}
