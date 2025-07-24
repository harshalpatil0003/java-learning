package Employee;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		EmployeeDB ref=new EmployeeDB("Harsh", "123");
		
		ref.login("Harsh", "123");
		
		ref.addEmployee("Harshal", 756, 101, 10, "Manager", "22/05/1990", 1800.0, 0.0);
		ref.addEmployee("Chaitanya", 756, 102, 10, "Manager", "22/05/1991", 2500.0, 100.0);
		ref.addEmployee("Rohit", 654, 120, 10, "Salesman", "28/06/1990", 2300.0, 90.0);
		ref.addEmployee("Aditya", 756,  122, 20, "Salesman", "22/05/1990", 3000.0, 300.0);
		ref.addEmployee("Ganesh", 654, 138, 10, "Manager", "22/05/1990", 3000.0, 30.5);
		ref.addEmployee("Swanand", 852, 130, 10, "Salesman", "22/05/1990", 2000.0, 0.0);
		ref.addEmployee("Om", 654, 125, 20, "Manager", "22/05/1990", 2800.0, 200.0);
		ref.addEmployee("Arya", 678, 222, 30, "Clerk", "22/05/1990", 2000.0, 150.50);
		ref.addEmployee("Sansa", 721, 196, 30, "Clerk", "22/05/1990", 1000.0, 120.0);
		ref.addEmployee("John", -1, 168, 30, "President", "22/05/1990", 2800.0, 0.0);
		ref.addEmployee("Sarcie", 700, 167, 20, "Clerk", "22/05/1990", 2700.0, 0.0);
		ref.addEmployee("Jamie", 520, 169, 20, "Salesman", "22/05/1990", 2800.0, 0.0);
		ref.addEmployee("Tyrion", 560, 170, 20, "Clerk", "22/05/1990", 1000.0, 0.0);
		
		//ref.showDb();
		
		//ref.searchByRole("Salesman");
		//ref.searchByDeptNo(10);
		System.out.println("I] See Salary ");
		System.out.println("1: Salary less than 2000");
		System.out.println("2: Salary equal to 2000");
		System.out.println("3: Salary greater than 2000");

		System.out.print("Enter option: ");
		int opt= new Scanner(System.in).nextInt();
		switch (opt) {
		case 1: {
			ref.searchBySalary1(0);
			break;
		}
		case 2:{
			ref.searchBySalary2(0);
		}
		case 3:{
			ref.searchBySalary3(0);
		}
		default:
		System.out.println("Unexpected value: " + opt);

	}
//		//ref.searchBySalary1(0);
//		//ref.searchBySalary2(0);
//		//ref.searchBySalary3(0);
//		//ref.emplysUnderManager(0);
//		System.out.println("---------------------------------------------------------------------");
//		
//		System.out.println("II] See Commission");
//			System.out.println("1: Employees who dont take comission");
//			System.out.println("2: Employees who take comission greater than 150");
//			System.out.println("3: Employees who take comission between 100 to 300");
//			System.out.print("Enter Option: ");
//			
//			int n= new Scanner(System.in).nextInt();
//			switch (n) {
//			case 1: {
//				ref.searchByCommision1(0);
//				break;
//			}
//			case 2: {
//				ref.searchByCommision2(0);
//				break;
//			}
//			case 3: {
//				ref.searchByCommision3(0);
//				break;
//			}
//			default:
//				System.out.println("Unexpected value: " + n);
//			}
//			System.out.println("-----------");
//			//ref.empWithoutManager(0);
//			System.out.println("-----------");
//			//ref.empWithMaxSal(0.0);
//			//ref.secMaxSalary(0.0);
			
			//ref.sortBy("emplId");
			
		
	}
}
