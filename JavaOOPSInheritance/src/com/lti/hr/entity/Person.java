package com.lti.hr.entity;

public abstract class Person {
	int id;
	 String name;
	 
	public abstract void calSal();
		
	public void show(){
		System.out.println("show method");

		
		
	}
	 
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person() {
	super();
	}
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
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	 

}
