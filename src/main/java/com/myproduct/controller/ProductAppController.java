package com.myproduct.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproduct.common.ResponseMessageBean;
import com.myproduct.entity.Product;
import com.myproduct.repo.ProductRepo;
import com.myproduct.response.DbConfigInfo;


@RestController
public class ProductAppController {

	@Autowired
	private Environment env;
	
	@Autowired
	ProductRepo productRepo;
	
	@GetMapping("/api/getproductdetails")
	public ResponseMessageBean user(Authentication authentication) {
		
		List<Product> productList = productRepo.findAll(); 
		
		return new ResponseMessageBean(200, productList);
	}
	
	@GetMapping("/api/getconfigdetails")
	public ResponseMessageBean admin(Authentication authentication) {
		
		String dataSourceURL = env.getProperty("spring.datasource.url");
		String dbUserName = env.getProperty("spring.datasource.username");
		String dbPassword = env.getProperty("spring.datasource.password");
		String dbDriver = env.getProperty("spring.datasource.driver-class-name");
		
		return new ResponseMessageBean(200, new DbConfigInfo(dataSourceURL,dbUserName, dbPassword,dbDriver));
	}
	
	@GetMapping("/forbiddenAccess")
	public ResponseMessageBean forbiddenResponse() {
		return new ResponseMessageBean(403, "you are n't authorized");
	}
}
