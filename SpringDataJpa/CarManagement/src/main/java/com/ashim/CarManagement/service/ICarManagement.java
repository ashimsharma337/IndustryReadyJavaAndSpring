package com.ashim.CarManagement.service;

import java.util.List;

import com.ashim.CarManagement.bo.CarDetails;

public interface ICarManagement {
    
	public String registerCarDetails(CarDetails car);
	public List<CarDetails> registerMultipleCarDetails(List<CarDetails> carList);
}

