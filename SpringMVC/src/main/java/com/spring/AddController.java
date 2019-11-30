package com.spring;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.AddService;

@Controller
public class AddController {

	Logger log = Logger.getLogger(AddController.class);
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
		log.info(".....Ureka....");
		int i = Integer.parseInt(req.getParameter("t1"));
		int j = Integer.parseInt(req.getParameter("t2"));
		
		AddService as = new AddService();		
		int k = as.add(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", k);
		
		return mv;
	}
	
}
