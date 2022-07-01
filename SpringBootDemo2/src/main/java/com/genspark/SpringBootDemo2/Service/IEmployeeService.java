package com.genspark.SpringBootDemo2.Service;

import com.genspark.SpringBootDemo2.Entity.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(int employee_id);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployeeById(int employee_id);
}
