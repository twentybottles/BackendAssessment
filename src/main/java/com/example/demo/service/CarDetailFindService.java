package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.entity.CarDetailEntity;
import com.example.demo.exception.MyResourceNotFoundException;
import com.example.demo.repository.CarDetailRepository;

@Service
public class CarDetailFindService {

    @Autowired
    private CarDetailRepository carDetailRepository;

    @Transactional
    public CarDetailEntity find(long id) {

    	try {

        	return carDetailRepository.findById(id).orElseThrow();

    	} catch (MyResourceNotFoundException e) {

    		throw new ResponseStatusException(HttpStatus.NO_CONTENT, "failed findById", e);

    	}

    }
    
    @Transactional
    public List<CarDetailEntity> findAll() {

    	try {

        	return carDetailRepository.findAll();

    	} catch (MyResourceNotFoundException e) {

    		throw new ResponseStatusException(HttpStatus.NO_CONTENT, "failed findAll", e);

    	}

    }


}