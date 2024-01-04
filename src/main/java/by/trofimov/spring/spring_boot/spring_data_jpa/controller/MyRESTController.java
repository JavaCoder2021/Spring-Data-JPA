package by.trofimov.spring.spring_boot.spring_data_jpa.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import by.trofimov.spring.spring_boot.spring_data_jpa.entity.Employee;
import by.trofimov.spring.spring_boot.spring_data_jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import static by.trofimov.spring.spring_boot.util.Constant.EMPLOYEE_WITH_ID;
import static by.trofimov.spring.spring_boot.util.Constant.WAS_DELETED;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdateEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdateEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return EMPLOYEE_WITH_ID + id + WAS_DELETED;
    }

}
