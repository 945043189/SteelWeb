package com.steelgt.gavin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steelgt.gavin.dao.ICityDao;
import com.steelgt.gavin.po.City;

@Service
public class CityService implements ICityService {
	private static final Logger LOGGER = LoggerFactory.getLogger(CityService.class);

	@Autowired
	private ICityDao cityDao;

	@Override
	public List<City> getAll() {
		LOGGER.info("以下查询所有城市信息。。。");
		return cityDao.getAll();
	}

	@RequestMapping("/")
	@Override
	public java.lang.String home() {
		LOGGER.info("欢迎您，打开steelgt网站的首页");
		return "hello world,mybatis";
	}
}
