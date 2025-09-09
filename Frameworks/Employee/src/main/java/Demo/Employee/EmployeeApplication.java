package Demo.Employee;


import Demo.Employee.dao.EmployeeDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class EmployeeApplication {

    @Bean
    public CommandLineRunner CommandLineRunner(EmployeeDAO theEmployeeDAO)
    {
        return runner -> {
            Scanner sc= new Scanner(System.in);
//            System.out.println("Enter Employee First name");
//            String firstname=sc.nextLine();
//            System.out.println("Enter Employee last name");
//            String lastname=sc.nextLine();
//            System.out.println("Enter Employee Contact");
//            long contact=sc.nextLong();
//            System.out.println("Enter Employee salary");
//            double salary=sc.nextDouble();
//            System.out.println("Enter Designation");
//            String designation= sc.nextLine();
//
//            Employee theEmployee = new Employee(firstname, lastname, contact, salary, designation);
//            theEmployeeDAO.save(theEmployee);
//            System.out.println("Employee saved successfully!");

//            System.out.println("Enter Id");
//            int id=sc.nextInt();
//
//            Employee e= theEmployeeDAO.getById(id);
//            if (e!=null){
//                System.out.println(id);
//            }
//            else{
//                System.out.println("Not found! ");
//            }
//            System.out.println(theEmployeeDAO.fetchAll());

//System.out.println("enter the id");
//theEmployeeDAO.update(sc.nextInt());



    };

    }
    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);

    }



}