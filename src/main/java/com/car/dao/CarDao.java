package com.car.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.car.Entity.Car;
import com.car.repository.CarRepository;

@Repository
public class CarDao {

	@Autowired
	CarRepository cr;

	public List<Car> postAll(List<Car> a) {
		return cr.saveAll(a);
	}

	public List<Car> getAll() {
		
		return cr.findAll();
	}
}
