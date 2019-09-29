package com.steelgt.gavin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.steelgt.gavin.po.City;
import com.steelgt.gavin.service.ICityService;

@RestController
public class CityController {
	@Autowired
	ICityService cityService;
	private static final Logger LOGGER = LoggerFactory.getLogger(CityController.class);

	@RequestMapping("/")
	String home() {
		return cityService.home();
	}

	@RequestMapping(value = { "/getCityList" }, method = RequestMethod.GET)
	public List<City> getUserList() {
		List list = cityService.getAll();
		LOGGER.info("查询城市信息，共有" + list.size() + "个城市");
		return list;
	}

	@RequestMapping(value = { "/getCityListByPost" }, method = RequestMethod.POST)
	public List<City> getUserListByPost() {
		List list = cityService.getAll();
		LOGGER.info("查询城市信息。。。。。。。。。");
		return list;
	}
}
