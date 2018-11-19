package com.teamsankya.naturebandhuproject.controller;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.teamsankya.naturebandhuproject.dto.ProductDetailsBean;
import com.teamsankya.naturebandhuproject.service.NatureBandhuService;

/**
 * This is a Controller class to interact with view and model
 * 
 * {@Controller} Indicates that a particular class serves the role of a
 * controller. {@link RequestMapping} This specify what HTTP Request is handled
 * by the controller and by its method. {@Autowired} This is used for
 * automatic dependency injection. {@Qualifier} This is used to avoid
 * conflicts in bean mapping and we need to provide the bean name that will be
 * used for autowiring.
 * 
 * 
 * @author Samarpita
 */

@Controller
@Transactional
public class NatureBandhuController {
	@Autowired
	@Qualifier("service")
	private NatureBandhuService service;
	

	final static Logger LOGGER = Logger.getLogger(NatureBandhuController.class);

	/**
	 * 
	 * @param map
	 * @param productName
	 * @return String(jsp page name)
	 */
	
	
	@RequestMapping(path = "/getproduct",method = RequestMethod.POST)
	public String getProduct(ModelMap map,@RequestParam("name")String productName) throws IOException {
		
		LOGGER.info("inside NatureBandhu Controller");
		LOGGER.info(productName);

		List<ProductDetailsBean> productList = service.getProduct(productName);
		map.addAttribute("productbean", productList);
		if(productList.size() ==0) {

			LOGGER.info(" inside controller failure block");
			return "failure";
		}
		LOGGER.info("The product : "+productList);
		LOGGER.info("inside controller success block");
		
		
		return "success";

	}

}
