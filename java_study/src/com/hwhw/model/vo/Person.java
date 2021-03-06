package com.hwhw.model.vo;

public class Person {
	
	protected String name; //
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int age, double height, double weight) {
		//age, height, weight는 부모 생성자를 통해 초기화
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String toString() {
		return " [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
	

}
