package com.ashim.CarPagingAndSorting.service;

import com.ashim.CarPagingAndSorting.bo.CarDetails;

public interface ICarManagement {
    
	public Iterable<CarDetails> fetchDetails(boolean status, String... properties);
	
}
