package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.beans.Employee;
import com.capgemini.service.EmpService;


@RestController
public class EmpController {


	@Autowired
	private EmpService empService;

	@RequestMapping("/employee")
	public List<Employee> getAllEmployees() {
		return empService.getAllEmployees();
	}

	@RequestMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return empService.getEmployee(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addemployee")
	public void addEmployee(@RequestBody Employee emp) {
		empService.addEmployee(emp);
	}

//	@RequestMapping(method = RequestMethod.PUT, value = "/employee/{id}")
//	public void updateEmployee(@RequestBody Employee emp, @PathVariable String id) {
//		empService.updateEmployee(id, emp);
//	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteemployee/{id}")
	public void deleteTopic(@PathVariable String id) {
		empService.deleteEmployee(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/employeesalary")
	public List<Employee> getEmployeeSalary() {
		return empService.getEmployeeSalary();	
	}	
	
	@RequestMapping(method = RequestMethod.GET, value = "/employeedesignation")
	public List<Employee> getEmployeeDesignation() {
		return empService.getEmployeeDesignation();
		
	}
	
	
}
