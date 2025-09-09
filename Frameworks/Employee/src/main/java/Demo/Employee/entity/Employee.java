package Demo.Employee.entity;

import jakarta.persistence.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@Entity
@Table(name="Emp_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="EmpId")
    private int id;

    @Column(name="FirstName")
    private String firstName;

    @Column (name="LastName")
    private String lastName;

    @Column(name="ContactInfo")
    private long phno;
    @Column(name="designation")
    private String designation;


    @Column(name="Salary")
    private double salary;


    public Employee() {
    }

    public Employee( String firstName, String lastName,long phno,double salary,String designation ) {
        this.salary = salary;
        this.designation = designation;
        this.phno = phno;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhno() {
        return phno;
    }

    public void setPhno(long phno) {
        this.phno = phno;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phno=" + phno +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
