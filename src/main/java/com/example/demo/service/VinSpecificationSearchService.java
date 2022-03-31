package com.example.demo.service;

import static com.example.demo.common.WebConst.VIN_SPECIFICATION_LOGIN_URL;
import static com.example.demo.common.WebConst.VIN_SPECIFICATION_SEARCH_URL;
import static com.example.demo.common.WebConst.VIN_API_USERNAME;
import static com.example.demo.common.WebConst.VIN_API_PASSWORD;
import static com.example.demo.common.WebConst.OK;


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
        	
//          String jsonString = "{\"email\": \""+ VIN_API_USERNAME + "\"," + "\"password\": \"" + VIN_API_PASSWORD + "\"}";   	
//        	String resJson = restTemplate.postForObject(VIN_SPECIFICATION_LOGIN_URL, jsonString, String.class);  
        	// It is necessary to register www.clearvin.com to get apikey as the authentication
            String resJson = "{\"status\": \"ok\", \"token\": \"ABCDEFG1234567\"}";
            
        	JSONObject jsonObj = new JSONObject(resJson);
        	
        	String status = jsonObj.getString("status");
        	String token = jsonObj.getString("token");
        	
        	if (OK.equals(status)) {

//        		return restTemplate.getForObject(VIN_SPECIFICATION_SEARCH_URL + vin + "?apikey:" + token, VinSpecificationEntity.class);
        		
        		return createResponseEntity();
        		
        	}
        	
        	throw new InternalAuthenticationServiceException(HttpStatus.SERVICE_UNAVAILABLE.toString() + ": ExtenalAPI doesn't work");

    	} catch (MyResourceNotFoundException e) {

    		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CarDetail Not Found", e);

    	}

    }
    
    private VinSpecificationEntity createResponseEntity () {
    	
    	VinSpecificationEntity entity = new VinSpecificationEntity();
    	entity.setStatus(OK);
    	entity.setMessage("Contains details about the result if status is error");
    	entity.setReportId("ReportId");
    	entity.setReportVin("4F2YU09161KM33122");
    	entity.setYear("2011");
    	entity.setMake("Audi");
    	entity.setModel("A6");
    	entity.setTrim_level("");
    	entity.setEngine("3.5L V6 SOHC 24V");
    	entity.setStyle("SPORT UTILITY 4-DR");
    	entity.setMade_in("UNITED STATES");
    	entity.setSteering_type("R&P");
    	entity.setAnti_brake_system("4-Wheel ABS");
    	entity.setTank_size("21.00 gallon");
    	entity.setOverall_height("72.70 in.");
    	entity.setOverall_length("190.90 in.");
    	entity.setOverall_width("78.50 in.");
    	entity.setStandard_seating("8");
    	entity.setOptional_seating("");
    	entity.setHighway_mileage("22 miles/gallon");
    	entity.setCity_mileage("16 miles/gallon");
    	entity.setLicense_plate("N/A");
    	entity.setRegistration("N/A");
    	entity.setRegistration_state("ok");
    	entity.setRegistration_expiration("20300101");
    	entity.setName_on_registration("CutomerName");
    	
		return entity;
    	
    } 

}