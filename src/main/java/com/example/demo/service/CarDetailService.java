package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.exception.MyResourceNotFoundException;
import com.example.demo.repository.CarDetailRepository;

@Service
public class CarDetailService {

    @Autowired
    private CarDetailRepository carDetailRepository;

    @Transactional
    public void delete(long id) {

    	try {

        	carDetailRepository.deleteById(id);

    	} catch (MyResourceNotFoundException e) {

    		throw new ResponseStatusException(HttpStatus.NO_CONTENT, "failed deleteById", e);

    	}

    }

}