package com.spring.service;
/*
 * Annotation class used to replace xml based configuration
 * @auther - akshay
 * */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration //to tell spring its a configuration class
@ComponentScan({ "com.spring" }) //to scan component //can add multple location with ","
public class SpringConfig 
{
	
	//Internal View Resolver -- so we can switch front end technology (eg jsp to jsf etc).
	@Bean
	public InternalResourceViewResolver viewResolver() 
	{
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
	
	
}
