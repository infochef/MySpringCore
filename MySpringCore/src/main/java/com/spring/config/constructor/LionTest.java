package com.spring.config.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LionTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = 
				
				new ClassPathXmlApplicationContext("LionConfig.xml");
		
		Lion l = ctx.getBean(Lion.class);
		l.eat.eat();
		System.out.println(l);
		
		
		
	}
}