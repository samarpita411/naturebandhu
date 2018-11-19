package com.teamsankya.naturebandhuproject.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.teamsankya.naturebandhuproject.controller.NatureBandhuController;
import com.teamsankya.naturebandhuproject.dao.NatureBandhuDao;
import com.teamsankya.naturebandhuproject.dto.ProductCategoryBean;
import com.teamsankya.naturebandhuproject.dto.ProductDetailsBean;


@Service
public class NatureBandhuServiceImpl implements NatureBandhuService {
	
	
	@Autowired
	@Qualifier("dao")
	private NatureBandhuDao dao;

	
	final static Logger LOGGER = Logger.getLogger(NatureBandhuServiceImpl.class);
	/**
	 * Default Constructor
	 */
	public NatureBandhuServiceImpl() {
		
	}
	
	public List<ProductDetailsBean> getProduct(String productName)
	{
		LOGGER.info("inside NatureBandhuServiceImpl ");
		
		LOGGER.info("service product :"+productName);
	
		
//		int maxResults=3;
//      int firstResult=util.getPaginationDetail(limit,maxResults);
        
		LOGGER.info("calling dao getProduct method");
        return dao.getProduct(productName);
	}

}
