package com.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car.Entity.Car;

public interface CarRepository extends JpaRepository<Car,Integer>{

}
