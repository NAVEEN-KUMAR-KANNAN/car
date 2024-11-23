package com.car.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.Entity.Car;
import com.car.service.CarService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping(value="/get")
public class CarController {

	@Autowired
	CarService cs;
	
	@PostMapping(value="/post")
	public List<Car> postAll(@RequestBody List<Car> a) {
		return cs.postAll(a);
	}
	@GetMapping(value="/data")
	public List<Car> getAll() {
		return cs.getAll();
	}
	
}
