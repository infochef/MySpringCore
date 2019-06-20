package com.spring.config.autowiring;

import javax.inject.Named;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("test")
@Named("test")
@Primary
public class SoftwareTester implements Job{

	@Override
	public void dojob() {
		// TODO Auto-generated method stub
		
		System.out.println("Test Test Test.....");
	}

}
