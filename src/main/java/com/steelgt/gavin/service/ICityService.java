package com.steelgt.gavin.service;

import java.util.List;

import com.steelgt.gavin.po.City;

public interface ICityService {
	List<City> getAll();

	String home();
}
