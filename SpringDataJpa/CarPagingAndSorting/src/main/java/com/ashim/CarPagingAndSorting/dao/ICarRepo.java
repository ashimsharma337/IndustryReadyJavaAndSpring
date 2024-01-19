package com.ashim.CarPagingAndSorting.dao;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ashim.CarPagingAndSorting.bo.CarDetails;

@Repository
public interface ICarRepo extends PagingAndSortingRepository<CarDetails, Long>{

}

