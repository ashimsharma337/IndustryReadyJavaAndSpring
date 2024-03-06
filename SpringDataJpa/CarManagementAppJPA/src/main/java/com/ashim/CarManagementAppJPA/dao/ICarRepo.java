package com.ashim.CarManagementAppJPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashim.CarManagementAppJPA.bo.CarDetails;

public interface ICarRepo extends JpaRepository<CarDetails, Long>{

}
