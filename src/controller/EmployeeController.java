package controller;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
    private EmployeeService employeeService = new EmployeeServiceImpl();

    public void create(Employee e) {
        employeeService.create(e);
    }

    public void update(Employee e) {
        employeeService.update(e);
    }

    public List<Employee> findAll() {
        return employeeService.findAll();
    }
}
