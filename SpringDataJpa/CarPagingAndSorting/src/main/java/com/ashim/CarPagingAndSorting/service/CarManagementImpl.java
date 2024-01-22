package com.ashim.CarPagingAndSorting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

	@Override
	public List<CarDetails> fetchCarDetailsByPgNo(int pgNo, int pgSize, boolean status, String... properties) {
		PageRequest pageable = PageRequest.of(pgNo, pgSize, status ? Direction.ASC : Direction.DESC, properties);
		
		Page<CarDetails> page = repo.findAll(pageable);
		List<CarDetails> list = page.getContent();
		
		return list;
	}

}
