package com.jn2ser.demoService.dtos;

public class RequestDemoDTO {
	
	private String name;
	private int age;
	public RequestDemoDTO() {
		super();
	}
	public RequestDemoDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "RequestDemoDTO [name=" + name + ", age=" + age + "]";
	}

}
