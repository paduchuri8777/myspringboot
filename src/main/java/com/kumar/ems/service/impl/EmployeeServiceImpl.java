package com.kumar.ems.service.impl;

import org.springframework.stereotype.Service;

import com.kumar.ems.model.Employee;
import com.kumar.ems.repository.EmployeeRepository;
import com.kumar.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeerepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeerepository.save(employee);
	}

}
