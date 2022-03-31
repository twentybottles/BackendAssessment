package com.example.demo.controller;

import static com.example.demo.common.WebConst.CARDETAIL_FINDALL_URL;
import static com.example.demo.common.WebConst.CARDETAIL_FIND_URL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.CarDetailEntity;
import com.example.demo.service.CarDetailFindService;

@Controller
public class CarDetailFindController {

	@Autowired
	private CarDetailFindService carDetailFindService;

	@RequestMapping(path = CARDETAIL_FIND_URL, method = RequestMethod.GET)
	public CarDetailEntity carDetailFind(@RequestParam(value = "id") String id) {

		return carDetailFindService.find(Long.parseLong(id));

	}

	@RequestMapping(path = CARDETAIL_FINDALL_URL, method = RequestMethod.GET)
	public List<CarDetailEntity> carDetailFindAll() {

		return carDetailFindService.findAll();

	}

}