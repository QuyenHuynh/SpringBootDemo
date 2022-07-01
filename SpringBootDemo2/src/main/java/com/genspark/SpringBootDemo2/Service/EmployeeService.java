package com.genspark.SpringBootDemo2.Service;

import com.genspark.SpringBootDemo2.Dao.EmployeeDao;
import com.genspark.SpringBootDemo2.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public EmployeeService() {
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee getEmployeeById(int employee_id) {
        Optional<Employee> e = this.employeeDao.findById(employee_id);
        Employee employee = null;

        if (e.isPresent()) {
            employee = e.get();
        } else {
            throw new RuntimeException("Employee not found for id :: " + employee_id);
        }

        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
       return this.employeeDao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public String deleteEmployeeById(int employee_id) {
        this.employeeDao.deleteById(employee_id);
        return "Employee " + employee_id + " has been deleted";
    }
}
