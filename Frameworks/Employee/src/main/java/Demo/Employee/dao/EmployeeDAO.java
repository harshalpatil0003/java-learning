package Demo.Employee.dao;

import Demo.Employee.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.List;

public interface EmployeeDAO<list> {

    public void save(Employee theEmployee);

    public Employee getById(int id);
    public Employee getByPhone( long phno);
    public List<Employee> fetchAll();

    public void update(int id);
    public void remove(int id);

}
