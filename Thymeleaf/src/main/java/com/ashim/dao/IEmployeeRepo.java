package com.ashim.dao;

import org.springframework.data.repository.CrudRepository;

import com.ashim.bo.Employee;

public interface IEmployeeRepo extends CrudRepository<Employee, Long>{

}
