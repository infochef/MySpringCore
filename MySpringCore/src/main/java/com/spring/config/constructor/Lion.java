package com.spring.config.constructor;

public class Lion {

	int id;
	String name;
	String gender;
	Eat eat;
	public Lion(int id, String name, String gender, Eat eat) {

		this.id = id;
		this.name = name;
		this.gender = gender;
		this.eat = eat;
	}
	@Override
	public String toString() {
		return "Lion [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}





}