package com.hwhw.model.vo;

public class Employee extends Person{
	
	private int salary;
	private String dept;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	//매개변수 생성자
	//name 값은 부모 필드 값에 직접 접 근해서 초기화
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		//age, height, weight는 부모 생성자를 통해 초기화
		super(age, height, weight); //부모클래스에 있는 생성자를 불러온다 
		//반드시 첫줄에 있어야 한다 
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}
	// dept에 왜 값이 안들어감..? 도대체..

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "salary :" + salary + "dept :" + dept;
		// 그 클래스의 부모의 객체들을 가르키는 변수 
	}
	
	
	
	

}
