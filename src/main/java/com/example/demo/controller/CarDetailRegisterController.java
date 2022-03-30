package com.example.demo.controller;

import static com.example.demo.common.WebConst.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.CarDetailEntity;
import com.example.demo.service.CarDetailRegisterService;
import com.example.demo.service.VinSpecificationSearchService;

@Controller
public class CarDetailRegisterController {

	@Autowired
	private VinSpecificationSearchService vinSpecificationSearchService;

	@Autowired
	private CarDetailRegisterService carDetailRegisterService;

	@RequestMapping(path = CARDETAIL_REGISTER_URL, method = RequestMethod.POST)
	public ResponseEntity<String> carDetailRegister(@RequestBody CarDetailEntity carDetail) {

//		carDetail.setVinSpecification(vinSpecificationSearchService.search(carDetail.getVin()));

		carDetailRegisterService.save(carDetail);

		return ResponseEntity.ok("success");

	}

}