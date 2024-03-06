package com.ashim.CarManagementAppJPA.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="CAR_NAME")
	private String carName;
	
	@Column(name="CAR_COMPANY")
	private String carCompany;
	
	@Column(name="CAR_PRICE")
	private int carPrice;

	public CarDetails() {
		super();
	}

	public CarDetails(String carName, String carCompany, int carPrice) {
		super();
		this.carName = carName;
		this.carCompany = carCompany;
		this.carPrice = carPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "CarDetails [id=" + id + ", carName=" + carName + ", carCompany=" + carCompany + ", carPrice=" + carPrice
				+ "]";
	}
	
	

}

