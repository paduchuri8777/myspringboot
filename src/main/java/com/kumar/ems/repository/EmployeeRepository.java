package com.kumar.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumar.ems.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
