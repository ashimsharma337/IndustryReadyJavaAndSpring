package com.ashim.CarManagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashim.CarManagement.bo.CarDetails;


@Repository
public interface ICarRepo extends CrudRepository<CarDetails, Long>{

}

