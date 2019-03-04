package com.cts.emplmngt.service;

import java.util.List;

import com.cts.emplmngt.bean.Employee;
import com.cts.emplmngt.dao.EmployeeDAO;
import com.cts.emplmngt.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDAO dao = new EmployeeDAOImpl();
	public String insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.insertEmployee(employee);
	}

	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

	public List<Employee> getAllEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return dao.getAllEmployeeByName(name);
	}

}
