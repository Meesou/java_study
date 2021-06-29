package com.hw1.model.vo;

public class Product {

	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	} // 기본 생성자 
	
//	 * * 생성자를 작성하는 목적
//	 * 1. 객체를 생성해주기 위한 목적
//	 * 2. 매개변수로 전달받은 값들을 필드에 바로 초기화할 목적
//	 * 1. 반드시 클래스명과 동일해야된다. (대/소문자 구분)
//	 * 2. 반환형이 존재하지 않는다. (메소드와 유사해서 헷갈릴수있음)
//	 * 3. 매개변수 생성자를 명시적으로 작성하게되면 기본생성자를 JVM이 자동으로 만들어주지 않는다. 
//	 *    즉, 기본생성자는 항상 기본으로 작성하는 습관을 길러라
//	 * 
	public Product(String productId, String productName, String productArea, int price, double tax) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductArea() {
		return productArea;
	}


	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}


	@Override
	public String toString() { //info 
		return "Product [productId=" + productId + ", productName=" + productName + ", productArea=" + productArea
				+ ", price=" + price + ", tax=" + tax + "]";
	}
	
	
}
