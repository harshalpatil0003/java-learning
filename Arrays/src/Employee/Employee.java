package Employee;

public class Employee {

	String name;
	int managrNo;
	int emplId;
	int deptNo;
	String job;
	String hireDate;
	double salary;
	double comm;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int managrNo, int emplId, int deptNo, String job, String hireDate, double salary,
			double comm) {
		super();
		this.name = name;
		this.managrNo = managrNo;
		this.emplId = emplId;
		this.deptNo = deptNo;
		this.job = job;
		this.hireDate = hireDate;
		this.salary = salary;
		this.comm = comm;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", managrNo=" + managrNo + ", emplId=" + emplId + ", deptNo=" + deptNo
				+ ", job=" + job + ", hireDate=" + hireDate + ", salary=" + salary + ", comm=" + comm + "]";
	}
	
}
