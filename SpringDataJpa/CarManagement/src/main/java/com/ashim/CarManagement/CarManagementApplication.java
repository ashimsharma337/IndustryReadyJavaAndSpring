package com.ashim.CarManagement;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		
//		List<CarDetails> list = new ArrayList<>();
//		
//		list.add(new CarDetails("Accord", "Honda", 22700));
//		list.add(new CarDetails("Elantra", "Hyundai", 21000));
//		list.add(new CarDetails("Corolla", "Toyota", 20000));
//		
//		List<CarDetails> carList = service.registerMultipleCarDetails(list);
//		carList.forEach((c)->System.out.println("Name: "+c.getCarName()+"   "+"Company: "+c.getCarCompany()+"   "+"Price: "+c.getCarPrice()));
		
//		Long id = 1L;
//		Optional<CarDetails> optional = service.getCarDetail(id);
//		if(optional.isPresent()) {
//			System.out.println("Car with given id is: "+optional.get());
//		} else {
//			System.out.println("Car not found with id: "+id);
//		}
		
//		Long id = 2L;
//		Optional<CarDetails> optional = service.getCarDetail(id);
//		if(optional.isPresent()) {
//			String status = service.deleteCarById(id);
//			System.out.println(status);
//		} else {
//			System.out.println("Car not found with the id: "+id);
//		}
		
		List<CarDetails> carList = service.getAllCars();
		carList.forEach((c) -> System.out.println("Name: "+c.getCarName()+"   "+"Price: "+c.getCarPrice()+"\n"));
		context.close();
	}	                                            

}
