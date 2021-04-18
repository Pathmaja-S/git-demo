package com.gradedAssignment.Pathmaja.gradedAssignmemt.Pathmaja.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gradedAssignment.Pathmaja.gradedAssignmemt.Pathmaja.config.Employee;
import com.gradedAssignment.Pathmaja.gradedAssignmemt.Pathmaja.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	// vv important annotation --> it will make sure either the transaction occurs in full or nothing happens  
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		
		employeeDAO.save(theEmployee);
       
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
	
		employeeDAO.deleteById(theId);

	}

}
