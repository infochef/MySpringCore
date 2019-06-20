package com.spring.config.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersonConfig {
	
	@Bean("person")
	public Person getPerson(@Qualifier("Dev")Job j)
	{
		Person p= new Person();
		p.setId(101);
		p.setName("Somnath");
		p.setJob(j);
		return p;
	}
	
	@Primary
	@Bean("Dev")
	public SoftwareDeveloper getdeveloper()
	{
		SoftwareDeveloper d = new SoftwareDeveloper();
		return d;
	}
	@Primary
	@Bean("Test")
	public SoftwareTester gettester()
	{
		SoftwareTester e = new SoftwareTester();
		return e;
	}
	
	

}
