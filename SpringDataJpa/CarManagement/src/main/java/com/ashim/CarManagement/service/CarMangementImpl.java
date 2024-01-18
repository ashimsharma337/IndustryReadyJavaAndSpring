package com.ashim.CarManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashim.CarManagement.bo.CarDetails;
import com.ashim.CarManagement.dao.ICarRepo;

@Service
public class CarMangementImpl implements ICarManagement {
    
	@Autowired
	private ICarRepo repo;
	
	@Override
	public String registerCarDetails(CarDetails car) {
		
		repo.save(car);
		System.out.println("Implementing class of ICarRepo is "+repo.getClass().getName());
		return "Car Details Registered";
	}

	@Override
	public List<CarDetails> registerMultipleCarDetails(List<CarDetails> carList) {
		
		return (List<CarDetails>) repo.saveAll(carList);
	}

	

}