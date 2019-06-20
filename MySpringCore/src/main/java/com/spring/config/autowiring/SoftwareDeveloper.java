package com.spring.config.autowiring;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("dev")
@Named("dev") 
@Primary
public class SoftwareDeveloper implements Job {

	@Override
	public void dojob() {
		// TODO Auto-generated method stub
		
		System.out.println("Code Code Code......");
	}

}
