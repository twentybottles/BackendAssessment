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
public class CarDetailRegisterService {

    @Autowired
    private CarDetailRepository carDetailRepository;

    @Transactional
    public CarDetailEntity save(CarDetailEntity carDetailEntity) {

    	try {

        	return carDetailRepository.save(carDetailEntity);

    	} catch (MyResourceNotFoundException e) {

    		throw new ResponseStatusException(HttpStatus.CONFLICT, "failed registration", e);

    	}

    }

}