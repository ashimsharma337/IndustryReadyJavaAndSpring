package com.ashim.CarManagement.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Optional<CarDetails> getCarDetail(Long id) {
		
		return repo.findById(id);
	}

	@Override
	public String deleteCarById(Long id) {
		
		repo.deleteById(id);
		return "Car deleted with the id: "+id;
	}

	@Override
	public List<CarDetails> getAllCars() {
	
		return (List<CarDetails>) repo.findAll();
	}

	

}