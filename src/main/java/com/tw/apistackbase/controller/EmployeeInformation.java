package com.tw.apistackbase.controller;

public class EmployeeInformation {
	private String id ;
	private String name ;
	private String gender ;
	private int age ;
	public EmployeeInformation(){
		
	}

	public EmployeeInformation(String id,String name,String gender,int age){
		this.id = id ;
		this.name = name;
		this.age = age ;
		this.gender = gender ;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


//id，name，age和gender