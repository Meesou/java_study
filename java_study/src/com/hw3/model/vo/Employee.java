package com.hw3.model.vo;

public class Employee {

	private String empName; //클래스의 주소값 this 객체주소 
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	//this의 쓰임새 어디가 전역변수고 어디가 매개변수인지 몰라서 
	public Employee(String empName, String dept, String job, int age, char gender, int salary, double bonusPoint,
			String phone, String address) {
	//super() 를 꼭 써야되는 상황은 언제인가 ...
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
		
	}
	
	//배열이나 클래스도 리턴이 된다~ 
	//함수의 필요한 자료형을 나타내준다 
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", dept=" + dept + ", job=" + job + ", age=" + age + ", gender="
				+ gender + ", salary=" + salary + ", bonusPoint=" + bonusPoint + ", phone=" + phone + ", address="
				+ address + "]";
	}
	
	
}
