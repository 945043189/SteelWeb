package com.steelgt.gavin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.steelgt.gavin.po.City;

@Mapper
public interface ICityDao {
	List<City> getAll();

}
