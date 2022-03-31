package com.example.demo.service;

import static com.example.demo.common.WebConst.VIN_SPECIFICATION_LOGIN_URL;
import static com.example.demo.common.WebConst.VIN_SPECIFICATION_SEARCH_URL;
import static com.example.demo.common.WebConst.VIN_API_USERNAME;
import static com.example.demo.common.WebConst.VIN_API_PASSWORD;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
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
        	
            String jsonString = "{\"email\": \""+ VIN_API_USERNAME + "\"," + "\"password\": \"" + VIN_API_PASSWORD + "\"}";   	
        	String resJson = restTemplate.postForObject(VIN_SPECIFICATION_LOGIN_URL, jsonString, String.class);        	

        	JSONObject jsonObj = new JSONObject(resJson);
        	
        	String status = jsonObj.getString("status");
        	String token = jsonObj.getString("token");
        	
        	if ("OK".equals(status)) {

        		return restTemplate.getForObject(VIN_SPECIFICATION_SEARCH_URL + vin + "?apikey:" + token, VinSpecificationEntity.class);
        		
        	}
        	
        	throw new InternalAuthenticationServiceException(HttpStatus.SERVICE_UNAVAILABLE.toString() + ": ExtenalAPI doesn't work");

    	} catch (MyResourceNotFoundException e) {

    		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CarDetail Not Found", e);

    	}

    }

}