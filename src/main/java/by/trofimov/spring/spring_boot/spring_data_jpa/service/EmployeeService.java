package by.trofimov.spring.spring_boot.spring_data_jpa.service;

import java.util.List;
import by.trofimov.spring.spring_boot.spring_data_jpa.entity.Employee;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveOrUpdateEmployee(Employee employee);

    Employee getEmployee(int employee);

    void deleteEmployee(int id);

}
