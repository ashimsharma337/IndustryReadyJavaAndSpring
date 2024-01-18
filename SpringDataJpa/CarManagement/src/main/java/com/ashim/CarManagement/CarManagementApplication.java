package com.ashim.CarManagement;


import java.util.ArrayList;
import java.util.List;

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
		
//		CarDetails car = new CarDetails("Camry", "Toyota", 25000);
//		String message = service.registerCarDetails(car);
//		System.out.println(message);
		
		List<CarDetails> list = new ArrayList<>();
		
		list.add(new CarDetails("Accord", "Honda", 22700));
		list.add(new CarDetails("Elantra", "Hyundai", 21000));
		list.add(new CarDetails("Corolla", "Toyota", 20000));
		
		List<CarDetails> carList = service.registerMultipleCarDetails(list);
		carList.forEach((c)->System.out.println("Name: "+c.getCarName()+"   "+"Company: "+c.getCarCompany()+"   "+"Price: "+c.getCarPrice()));
	}	                                            

}
