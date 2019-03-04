package com.cts.emplmngt.main;

import javax.swing.SortingFocusTraversalPolicy;

import com.cts.emplmngt.bean.Employee;
import com.cts.emplmngt.service.EmployeeService;
import com.cts.emplmngt.service.EmployeeServiceImpl;

public class Main {
	public static void main(String[] args){
		System.out.println("Hello world");
		Employee employee = new Employee("124","nishu","saini",1234);
		EmployeeService emp = new EmployeeServiceImpl();
		emp.insertEmployee(employee);
		System.out.println(emp.getAllEmployee());
		System.out.println(emp.getAllEmployeeByName("nishu"));
	}
}
