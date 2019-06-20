package com.spring.config.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(PersonConfig.class);
		
		String []names = ctx.getBeanDefinitionNames();
		
		for(String name:names)
		{
			System.out.println(name);
		}
		
//		Person p = ctx.getBean(Person.class);
//		p.getJob().dojob();
//		
		
//		System.out.println("The method is executed");
	}


}