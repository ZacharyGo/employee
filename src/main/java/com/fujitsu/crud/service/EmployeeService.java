package com.fujitsu.crud.service;

import java.util.List;

import com.fujitsu.crud.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
}
