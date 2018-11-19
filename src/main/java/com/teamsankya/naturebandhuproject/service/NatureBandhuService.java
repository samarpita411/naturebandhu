package com.teamsankya.naturebandhuproject.service;

import java.util.List;

import com.teamsankya.naturebandhuproject.dto.ProductDetailsBean;

/**
 * In this Service Interface 
 * It communicate with DAO and give the response to controller
 *	@author Samarpita
 */



public interface NatureBandhuService {

	public List<ProductDetailsBean> getProduct(String productName);

}
