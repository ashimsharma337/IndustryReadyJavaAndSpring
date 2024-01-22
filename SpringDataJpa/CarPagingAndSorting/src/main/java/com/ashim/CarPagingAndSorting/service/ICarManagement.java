package com.ashim.CarPagingAndSorting.service;

import java.util.List;


import com.ashim.CarPagingAndSorting.bo.CarDetails;

public interface ICarManagement {
    
	public Iterable<CarDetails> fetchDetails(boolean status, String... properties);
	public List<CarDetails> fetchCarDetailsByPgNo(int pgNo, int pgSize, boolean status, String... properties);
	
}
