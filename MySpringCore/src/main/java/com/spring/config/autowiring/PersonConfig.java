package com.spring.config.autowiring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.config.demo.Dog;

@Configuration
@ComponentScan(basePackageClasses = {Person.class,Dog.class})
		
		/*basePackages = {"com.spring.config.autowiring","com.spring.config.demo"}*/
public class PersonConfig {

}
