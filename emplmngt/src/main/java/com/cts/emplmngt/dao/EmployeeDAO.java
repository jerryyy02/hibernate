package com.cts.emplmngt.dao;

import java.util.List;

import com.cts.emplmngt.bean.Employee;

public interface EmployeeDAO {
	 public String insertEmployee(Employee employee);
	 public String updateEmployee(String id, Employee employee);
	 public String deleteEmployee(String id);
	 public List<Employee> getAllEmployee();
	 public List<Employee> getAllEmployeeByName(String name);

}
