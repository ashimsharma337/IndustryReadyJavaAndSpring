package com.ashim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ashim.bo.Employee;
import com.ashim.dao.IEmployeeRepo;

public class EmployeeManagementImpl implements IEmployeeManagementService{
    
	@Autowired
	private IEmployeeRepo repo;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return (List<Employee>) repo.findAll();
	}

}
