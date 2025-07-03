package com.example.EmployeeDatabaseApp.Controller;

import com.example.EmployeeDatabaseApp.Entity.Employee;
import com.example.EmployeeDatabaseApp.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/employees")

public class EmployeeController {

@Autowired
    EmployeeRepository employeeRepository;

@PostMapping
    public Employee addEmployee(@RequestBody Employee employee){

    return employeeRepository.save(employee);

}

@GetMapping
    public List<Employee> getAll(){
    return employeeRepository.findAll();

}

@PutMapping("/{id}")
    public Employee UpdateEmployee(@PathVariable Long id,@RequestBody Employee updated){
     return employeeRepository.findById(id).map(emp->{
         emp.setName(updated.getName());
         emp.setRole(updated.getRole());
         emp.setSalary(updated.getSalary());
         return employeeRepository.save(emp);
     }).orElseThrow(()-> new RuntimeException("Employee not found"));
}

@DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
    employeeRepository.deleteById(id);
}

}
