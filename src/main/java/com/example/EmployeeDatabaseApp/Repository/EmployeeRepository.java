package com.example.EmployeeDatabaseApp.Repository;

import com.example.EmployeeDatabaseApp.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


}
