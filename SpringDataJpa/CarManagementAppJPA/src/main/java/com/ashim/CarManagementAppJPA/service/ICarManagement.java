package com.ashim.CarManagementAppJPA.service;

import org.springframework.data.domain.Example;

import com.ashim.CarManagementAppJPA.bo.CarDetails;

public interface ICarManagement {

	public Example<CarDetails> findAllCar();
}
