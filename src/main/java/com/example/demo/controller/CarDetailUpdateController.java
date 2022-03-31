package com.example.demo.controller;

import static com.example.demo.common.WebConst.CARDETAIL_UPDATE_URL;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.CarDetailEntity;
import com.example.demo.service.CarDetailUpdateService;

@Controller
public class CarDetailUpdateController {

	@Autowired
	private CarDetailUpdateService carDetailUpdateService;

	@RequestMapping(path = CARDETAIL_UPDATE_URL, method = RequestMethod.PUT)
	public CarDetailEntity carDetailUpdate(@Valid @RequestBody CarDetailEntity carDetail) {

		return carDetailUpdateService.update(carDetail);

	}

}