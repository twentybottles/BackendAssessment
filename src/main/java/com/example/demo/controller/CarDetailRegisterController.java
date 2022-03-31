package com.example.demo.controller;

import static com.example.demo.common.WebConst.CARDETAIL_REGISTER_URL;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
	public CarDetailEntity carDetailRegister(@Valid @RequestBody CarDetailEntity carDetail) {

		carDetail.setVin_specification(vinSpecificationSearchService.search(carDetail.getVin()));

		return carDetailRegisterService.save(carDetail);

	}

}