package com.ashim.CarManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashim.CarManagement.bo.CarDetails;
import com.ashim.CarManagement.service.CarMangementImpl;

@SpringBootApplication
public class CarManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CarManagementApplication.class, args);
		CarMangementImpl service = context.getBean(CarMangementImpl.class);
		
		CarDetails car = new CarDetails("Camry", "Toyota", 25000);
		service.registerCarDetails(car);
	}

}
