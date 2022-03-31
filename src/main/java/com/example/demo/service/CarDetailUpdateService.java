package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.entity.CarDetailEntity;
import com.example.demo.exception.MyResourceNotFoundException;
import com.example.demo.repository.CarDetailRepository;

@Service
public class CarDetailUpdateService {

    @Autowired
    private CarDetailRepository carDetailRepository;

    @Transactional
    public CarDetailEntity update(CarDetailEntity carDetailEntity) {

    	try {
    		
    		CarDetailEntity carDetail = carDetailRepository.findById(carDetailEntity.getId()).orElseThrow();
    		carDetail.setVin(carDetailEntity.getVin());
    		carDetail.setCar_value(carDetailEntity.getCar_value());
    		carDetail.setCurrent_mileage(carDetailEntity.getCurrent_mileage());
    		carDetail.setVehicle_description(carDetailEntity.getVehicle_description());
    		carDetail.setVehicle_color(carDetailEntity.getVehicle_color());
    		carDetail.setDelete_flg(carDetailEntity.getDelete_flg());

        	return carDetailRepository.save(carDetailEntity);

    	} catch (MyResourceNotFoundException e) {

    		throw new ResponseStatusException(HttpStatus.CONFLICT, "failed update", e);

    	}

    }

}