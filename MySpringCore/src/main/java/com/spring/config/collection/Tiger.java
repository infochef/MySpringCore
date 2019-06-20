package com.spring.config.collection;

import java.util.List;

public class Tiger {

	private int tid;
	private String name;
	private List<Job>job;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Job> getJob() {
		return job;
	}
	public void setJob(List<Job> job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Tiger [tid=" + tid + ", name=" + name + "]";
	}
	
}
