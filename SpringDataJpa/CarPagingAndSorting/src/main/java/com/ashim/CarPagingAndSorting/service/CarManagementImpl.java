package com.ashim.CarPagingAndSorting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ashim.CarPagingAndSorting.bo.CarDetails;
import com.ashim.CarPagingAndSorting.dao.ICarRepo;

@Service
public class CarManagementImpl implements ICarManagement {
    
	@Autowired
	private ICarRepo repo;
	
	@Override
	public Iterable<CarDetails> fetchDetails(boolean status, String... properties) {
		Sort sort = Sort.by(status? Direction.ASC : Direction.DESC, properties);
		return repo.findAll(sort);
	}

}
