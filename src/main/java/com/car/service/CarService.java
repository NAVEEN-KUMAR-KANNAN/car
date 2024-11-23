package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.Entity.Car;
import com.car.dao.CarDao;

@Service
public class CarService {

	@Autowired
	CarDao cd;

	public List<Car> postAll(List<Car> a) {
		return cd.postAll(a);
	}

	public List<Car> getAll() {
		return cd.getAll();
	}
	
	
}
