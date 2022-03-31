package com.example.demo.controller;

import static com.example.demo.common.WebConst.CARDETAIL_DELETE_URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.CarDetailService;

@Controller
public class CarDetailDeleteController {

	@Autowired
	private CarDetailService carDetailService;

	@RequestMapping(path = CARDETAIL_DELETE_URL, method = RequestMethod.DELETE)
	public void carDetailDetail(@RequestParam(value = "id") String id) {

		carDetailService.delete(Long.parseLong(id));
		
	}

}