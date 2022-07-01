package com.genspark.SpringBootDemo2.Controller;
import com.genspark.SpringBootDemo2.Entity.Employee;
import com.genspark.SpringBootDemo2.Service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService EmployeeService;

    //http://localhost:8080/
    @GetMapping("/")
    public String home(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "msg", defaultValue = "Good morning!") String msg) {
        return "Hello " + name + "! " + msg;
    }

    //http://localhost:8080/employees
    @GetMapping("/employees")
    public List<Employee> getCourses() {
        return this.EmployeeService.getAllEmployees();
    }

    @GetMapping("/employees/{employee_id}")
    public Employee getEmployeeById(@PathVariable String employee_id) {
        return this.EmployeeService.getEmployeeById(Integer.parseInt(employee_id));
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.EmployeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return this.EmployeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{employee_id}")
    public String deleteEmployee(@PathVariable String employee_id) {
        return this.EmployeeService.deleteEmployeeById(Integer.parseInt(employee_id));
    }
}
