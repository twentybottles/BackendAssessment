package com.example.demo.service;

import static com.example.demo.common.WebConst.*;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.entity.VinSpecificationEntity;
import com.example.demo.exception.MyResourceNotFoundException;

@Service
public class VinSpecificationSearchService {

    public VinSpecificationEntity search (String vin) {

    	try {

        	RestTemplate restTemplate = new RestTemplate();

        	return restTemplate.getForObject(VIN_SPECIFICATION_SEARCH_URL + vin, VinSpecificationEntity.class);

    	} catch (MyResourceNotFoundException e) {

    		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CarDetail Not Found", e);

    	}


    }

}