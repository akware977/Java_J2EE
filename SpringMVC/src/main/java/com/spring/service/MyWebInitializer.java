package com.spring.service;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * Class used to replace web.xml file to make use of annotations only.
 * @auther - Akshay
 * */

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {MvcConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//return new Class[] {SpringConfig.class};
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/"};
	}

}
