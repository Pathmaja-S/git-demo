package com.gradedAssignment.Pathmaja.gradedAssignmemt.Pathmaja.dao;

import java.util.List;

import com.gradedAssignment.Pathmaja.gradedAssignmemt.Pathmaja.config.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);
}
