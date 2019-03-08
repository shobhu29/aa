package com.capgemini.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.beans.Employee;


@Repository
public interface EmpRepository extends CrudRepository<Employee, String>{

	@Query("SELECT emp from Employee emp where emp.salary between 10000 and 20000")
	public List<Employee> getEmployeeSalary();
	
	@Query("SELECT emp from Employee emp where emp.designation ='Designer'")
	public List<Employee> getEmployeeDesignation();
	
}
