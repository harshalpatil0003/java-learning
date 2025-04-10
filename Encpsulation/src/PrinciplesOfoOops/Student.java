package PrinciplesOfoOops;

public class Student {
	String institute="Qspiders";
	String name;
	String course;
	double fees;
	String branch;
	double cgpa;
	String degree;
	double sscper;
	double hscper;
	long phno;
	
	Student(String name,String course,double fees,String branch,double cgpa,String degree,double sscper,double hscper,long phno){
		this.name=name;
		this.course=course;
		this.fees=fees;
		this.branch=branch;
		this.cgpa=cgpa;
		this.degree=degree;
		this.sscper=sscper;
		this.hscper=hscper;
		this.phno=phno;
	}
	
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	public double getFees() {
		return fees;
	}
	public String getBranch() {
		return branch;
	}
	public double getCgpa() {
		return cgpa;
	}
	public String getDegree() {
		return degree;
	}
	public double getSscper() {
		return sscper;
	}
	public double getHscper() {
		return hscper;
	}
	public long getPhno() {
		return phno;
	}
	public void setCourse(String institute,String name,String newcourse) {
		if (this.name.equals(name) && this.institute.equals(institute)) {
			course=newcourse;
			System.out.println("Course Updated to "+course);
		}
		else {
			System.out.println("Invalid name or institute");
		}
	}
	public void setBranch(String institute,String name, String newbranch) {
		if (this.name.equals(name) && this.institute.equals(institute)) {
			this.branch = newbranch;
			System.out.println("Branch is changed to "+branh);
		}
		else {
			System.out.println("Invalid name or institute");
		}
	}
	public boolean setPhno(boolean id,long phno) {
		if (id) {
			this.phno = phno;
			System.out.println("Phone number is changed to "+phno);
		}
		else {
			System.out.println("Invalid Id");
		}
		return false;
	}
	
	
	
}
