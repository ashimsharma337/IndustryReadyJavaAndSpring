package com.ashim.service;

import com.ashim.dao.Course;

public class PurchaseCourse {

	private Course course;
	
	public boolean proceedWithCourse(Course course) {
		return course.coursePurchased();
	}
}
