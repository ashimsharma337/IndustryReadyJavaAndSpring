package com.ashim.CarManagement.service;

import java.util.List;
import java.util.Optional;

import com.ashim.CarManagement.bo.CarDetails;

public interface ICarManagement {
    
	public String registerCarDetails(CarDetails car);
	public List<CarDetails> registerMultipleCarDetails(List<CarDetails> carList);
	public Optional<CarDetails> getCarDetail(Long id);
	public String deleteCarById(Long id);
	public List<CarDetails> getAllCars();
}

