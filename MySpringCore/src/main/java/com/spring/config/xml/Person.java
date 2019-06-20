package com.spring.config.xml;

import javax.enterprise.inject.spi.Bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, 
BeanPostProcessor, InitializingBean, DisposableBean{

	private int id;
	private String name;
	private Job job;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", job=" + job + "]";
	}
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bean name is= :"+name);
		
	}
	@Override
	public void setBeanFactory(BeanFactory beanfactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean Fatory name= :"+beanfactory);
		
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationcontext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Application Context = :"+applicationcontext);
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanname) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("After init= :"+beanname);
		return bean;
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanname) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Before init= :"+beanname);
		return bean;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean is Initilizing");
		
	}
	
	public void mycustominitmethod()
	{
		System.out.println("Custom init method");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean is going to die");
	}
	 
	
	public void mycustomDestroymethod()
	{
		System.out.println("Bean Destroyed");
	}
	 
	
}