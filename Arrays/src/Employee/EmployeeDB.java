package Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeDB {

	private String userName;
	private String pass;
	private Employee[] db=new Employee[10];
	private int cnt=0;
	

	public EmployeeDB(String userName, String pass) {
		super();
		this.userName = userName;
		this.pass = pass;
	}
	private boolean connect;
	public void login( String userName, String pass) {
		
		if (this.userName.equals(userName) && this.pass.equals(pass)) {
			System.out.println("---------Login successfully! -----------");
			connect=true;
			System.out.println("     ****Database Connected!****  ");
		}
		else {
			System.out.println("Invalid Credentials!");
		}
	}
	
	public boolean addEmployee(String name, int managrNo, int emplId, int deptNo, String job,
			String hireDate, double salary,double comm) 
	{
		if (connect && cnt<db.length*0.80) {
			
				db[cnt]= new Employee(name, managrNo, emplId, deptNo, job, hireDate, salary, comm);
				cnt++;
				//System.out.println("Employee added! ");
			return true;
		}
		else if (connect) {
			Employee[] arr= new Employee[db.length*2];
			for (int i = 0; i < db.length; i++) {
				arr[i]=db[i];
			}
			db=arr;
			db[cnt]= new Employee(name, managrNo, emplId, deptNo, job, hireDate, salary, comm);
			cnt++;
//			System.out.println("Employee added! ");
			return true;
			
		} 
		else {
			System.out.println("Couldn't resolve the connect identifier! ");
			return false;
		}	
	}
	
	public void showDb() {
		if (connect) {
			for (int i = 0; i < db.length; i++) {
				if (db[i]!=null) {
					System.out.println(db[i]);
				}
			}
		}
		else {
			System.out.println("Couldn't resolve the connect identifier! ");
		}
	}
	
	public void searchByRole(String job){
		
		if (!connect) {
			for (int i = 0; i < cnt; i++) {
				if (db[i].job.equalsIgnoreCase(job)) {
					
					System.out.println(db[i]);
				
				}
				else {
					System.err.println("Employee not found!");;
					break;
				}
			}
		}
		else {
			System.err.println("Couldn't resolve the connect identifier! ");
		}
	}
	
	public void searchByDeptNo(int deptNo) {
		if (connect) {
			boolean check =false;
			for (int i = 0; i < cnt; i++) {
				if (db[i].deptNo==deptNo) {
					check =true;
					System.out.println(db[i]);
				}
				else if(!check) {
					System.err.println("Employee not found!");;
					break;
				}
				
				
			}
		}
		else {
			System.err.println("Couldn't resolve the connect identifier! ");
		}
	}
	public void searchBySalary(double salary, char oprtr){
		if (connect) {
			switch (oprtr) {
			case '>': {
				for (int i = 0; i < cnt; i++) {
					if (db[i].salary>salary) {
						System.out.println(db[i]);
					}
				}
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + oprtr);
			}
		}
		else {
			System.err.println("Couldn't resolve the connect identifier! ");
		}
	}
	
		public void emplysUnderManager(int managrNo)
		{
			if (connect) 
			{
				
				for (int i = 0; i < db.length; i++)
				{
					
					if (db[i]!=null && db[i].managrNo==756) {
						System.out.println(db[i]);
					}
					if (db[i]!=null && db[i].managrNo==654) {
						System.out.println(db[i]);
					}
				}
			}
			else {
				System.err.println("Couldn't resolve the connect identifier! ");
			}
		}
		
		
		public void searchByCommision1( double comm) {
			if (connect) {
				for (int i = 0; i < db.length; i++) {
					if (db[i]!=null && db[i].comm==0.0) {
						System.out.println(db[i]);
					}
				}
			}
			else {
				System.err.println("Couldn't resolve the connect identifier! ");
			}
		}
		public void searchByCommision2( double comm) {
			if (connect) {
				for (int i = 0; i < db.length; i++) {
					if (db[i]!=null && db[i].comm>150.0) {
						System.out.println(db[i]);
					}
				}
			}
		}
		public void searchByCommision3( double comm) {
			if (connect) {
				for (int i = 0; i < db.length; i++) {
					if (db[i]!=null && db[i].comm<300.0 && db[i].comm>100) {
						System.out.println(db[i]);
					}
				}
			}
			else {
				System.err.println("Couldn't resolve the connect identifier! ");
			}
		}
		public void empWithoutManager(int managrNo) {
			if (connect) {
				for (int i = 0; i < db.length; i++) {
					if (db[i]!=null && db[i].managrNo<0) {
						System.out.println(db[i]);
					}
				}
			}
		}
		
		public void empWithMaxSal(double salary) {
			if (connect) {
				double max=0;
				int i;
				for (i = 0; i < db.length; i++) {
					if (db[i]!= null && db[i].salary>max) {
						max= db[i].salary;
					}
				}
				for (int j = 0; j < db.length; j++) {
					if (db[j].salary==max) {
						System.out.println(db[j]);
					}
				}	
			}
			else {
				System.err.println("Couldn't resolve the connect identifier! ");
			}
			
		}
		public void secMaxSalary(double salary) {
			if (connect) {
				double max=0;
				double secMax=0;
				int i;
				for (i = 0; i < db.length; i++) {
					if (db[i]!= null && db[i].salary>max) {
						secMax=max;
						max=db[i].salary;
					}
					else if(db[i]!= null && db[i].salary>secMax && db[i].salary!=max) {
						secMax=db[i].salary;
					}
				}
				for (int j = 0; j < db.length; j++) {
					if (db[j].salary==secMax ) {
						System.out.println(db[j]);
					}
				}
			}
		}
		
		public void sortBy(String opt) {
			
			if (opt=="emplId" || opt=="managrNo" || opt== "deptNo"|| opt=="salary" || opt=="comm") {
				
				for (int i = 0; i <cnt-1; i++) {
					for (int j = 0; j <cnt-1-i ; j++) {
						
						if (db[i]!=null && checkSwap(db[j], db[j+1], opt)>=1 ) {
					
							Employee temp=db[j];
							db[j]=db[j+1];
							db[j+1]=temp;
						}
					}
				}
			}
			else {
				System.out.println("Attribute is not comparable");
			}
		}
		
		private int checkSwap(Employee e1, Employee e2, String opt) {
			
			switch (opt) {
			case "emplId": {
				return whetherToSort(e1.emplId, e2.emplId);
			}
			case "deptNo": {
				return whetherToSort(e1.deptNo, e2.deptNo);
			}
			case "managrNo": {
				return whetherToSort(e1.managrNo, e2.managrNo);
			}
			case "salary": {
				return whetherToSort(e1.salary, e2.salary);
			}
			default:
				return -1000;
			}
			
		}
		
		private int whetherToSort(double n1,double n2) {
			if (n1>n2) {
				return 1;
			}
			else if (n1<n2) {
				return -1;
			}
			return 0;
		}

}
