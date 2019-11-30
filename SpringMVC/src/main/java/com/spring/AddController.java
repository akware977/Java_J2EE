package com.spring;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

	Logger log = Logger.getLogger(AddController.class);
	
	@RequestMapping("/add")
	public String add() {
		log.info("Ureka....");
		return "display.jsp";
	}
	
}
