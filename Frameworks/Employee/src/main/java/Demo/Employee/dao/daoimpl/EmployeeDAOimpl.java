package Demo.Employee.dao.daoimpl;

import Demo.Employee.dao.EmployeeDAO;
import Demo.Employee.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

@Repository
 public class EmployeeDAOimpl implements EmployeeDAO {

    private final EntityManager themanager;

    @Autowired
    public EmployeeDAOimpl(EntityManager themanager) {
        this.themanager = themanager;
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {
        themanager.persist(theEmployee);
    }


    @Override
    public Employee getById(int id) {
        return themanager.find(Employee.class,id);
    }

    @Override
    public Employee getByPhone(long phno){
       try {
           Query q= themanager.createQuery("select e from Employee e where e.phno=: phono");
           q.setParameter("phno", phno);
           return (Employee) q.getSingleResult();
       }
       catch (NoResultException e){
           return null;
       }
    }

    public List<Employee> fetchAll(){
        Query q=themanager.createQuery("select e from Employee");
        return q.getResultList();

    }

    @Override
    @Transactional
    public void update(int id){
        Scanner sc= new Scanner(System.in);
        Employee founEmployee=themanager.find(Employee.class,id);
        if (founEmployee==null){
            System.out.println("No such employee exist to update");
        }
        else{
            System.out.println("Enter new Salary: ");
            founEmployee.setSalary(sc.nextDouble());
        }
    }

    @Override
    @Transactional
    public void remove(int id){
        Scanner sc= new Scanner(System.in);
        Employee founEmployee=themanager.find(Employee.class,id);
        if (founEmployee==null){
            System.out.println("Not found");
        }
        else{
            themanager.remove(founEmployee);
        }
    }


}
