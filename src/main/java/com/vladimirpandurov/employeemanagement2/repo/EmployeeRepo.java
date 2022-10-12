package com.vladimirpandurov.employeemanagement2.repo;

import com.vladimirpandurov.employeemanagement2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
