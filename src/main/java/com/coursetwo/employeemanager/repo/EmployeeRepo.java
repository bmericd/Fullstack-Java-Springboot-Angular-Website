package com.coursetwo.employeemanager.repo;

import com.coursetwo.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    //Queries are generated here
    @Query("DELETE FROM Employee e WHERE e.id = ?1")
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
