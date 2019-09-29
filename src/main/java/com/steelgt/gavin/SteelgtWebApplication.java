package com.steelgt.gavin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

// @SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SteelgtWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SteelgtWebApplication.class, args);
	}

}
