package com.teamsankya.naturebandhuproject.dao;

import java.util.ArrayList;
import java.util.List;

import com.teamsankya.naturebandhuproject.dto.ProductCategoryBean;
import com.teamsankya.naturebandhuproject.dto.ProductDetailsBean;

public interface NatureBandhuDao {
	/**
	 * 
	 * @param CategoryId
	 * @return the ArrayList of ProductCategoryBean
	 */
public List<ProductDetailsBean> getProduct(String productName);

}
