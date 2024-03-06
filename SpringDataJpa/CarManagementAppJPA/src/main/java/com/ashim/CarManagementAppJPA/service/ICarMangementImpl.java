package com.ashim.CarManagementAppJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.ashim.CarManagementAppJPA.bo.CarDetails;
import com.ashim.CarManagementAppJPA.dao.ICarRepo;

@Service
public class ICarMangementImpl implements ICarManagement {
	
	@Autowired
	private ICarRepo repo;

	@Override
	public Example<CarDetails> findAllCar() {
		// TODO Auto-generated method stub
		return null;
	}

   



	
}
