package com.ashim.dao;

public class SpringBootCourse implements Course{

	@Override
	public boolean coursePurchased() {
		System.out.println("SpringBootCourse purchased");
		return true;
	}

}
