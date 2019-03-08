package com.capgemini.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.beans.Employee;
import com.capgemini.repo.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private EmpRepository emprepo;

	public List<Employee> getAllEmployees() {
		return (List<Employee>) emprepo.findAll();
	}

	public Employee getEmployee(String id) {
		return emprepo.findById(id).get();
	}

	public void addEmployee(Employee emp) {
		emprepo.save(emp);
	}

	public void deleteEmployee(String id) {
		emprepo.deleteById(id);
	}

	public List<Employee> getEmployeeSalary() {
		return emprepo.getEmployeeSalary();
	}

	public List<Employee> getEmployeeDesignation() {
		return emprepo.getEmployeeDesignation();
	}

//	public void updateEmployee(String id, Employee emp) {
//		emprepo.
//	}

}
