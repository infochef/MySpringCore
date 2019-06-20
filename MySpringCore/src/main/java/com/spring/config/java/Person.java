package com.spring.config.java;

public class Person {
	
	private int id;
	private String name;
	private Job Job;
	
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
		return Job;
	}
	public void setJob(Job job) {
		Job = job;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	

}
