package com.ashim.CarPagingAndSorting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashim.CarPagingAndSorting.bo.CarDetails;
import com.ashim.CarPagingAndSorting.service.CarManagementImpl;

@SpringBootApplication
public class CarPagingAndSortingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CarPagingAndSortingApplication.class, args);
		CarManagementImpl service = context.getBean(CarManagementImpl.class);
		
		// Try false for descending
		Iterable<CarDetails> carList = service.fetchDetails(true, "carName", "carCompany");
		carList.forEach((c) -> System.out.println(c.getCarName()+"=>"+c.getCarCompany()));
	}

}
