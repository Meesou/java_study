package com.hwhw2.model.vo;

public class Rectangle extends Point {

	private int width;
	private int height;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;

	}

	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		// 면적 : 너비 * 높이
		// 둘레 : 2 * (너비 + 높이)
		
		System.out.println(width * height);
		System.out.println(2 * (width + height));
		super.draw();
	}


}
