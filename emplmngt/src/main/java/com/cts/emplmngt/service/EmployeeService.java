package com.cts.emplmngt.service;

import java.util.List;

import com.cts.emplmngt.bean.Employee;

public interface EmployeeService {
	 public String insertEmployee(Employee employee);
	 public String updateEmployee(String id, Employee employee);
	 public String deleteEmployee(String id);
	 public List<Employee> getAllEmployee();
	 public List<Employee> getAllEmployeeByName(String name);
}
