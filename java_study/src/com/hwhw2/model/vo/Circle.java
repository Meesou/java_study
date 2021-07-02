package com.hwhw2.model.vo;

public class Circle extends Point{

	private int radius;
	
	 public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() { //부모 클래스의 draw() 메소드 호출을 통해 x, y 좌표 값 출력 후
		// TODO Auto-generated method stub
		
		// 면적 : PI * 반지름 * 반지름
		// 둘레 :PI* 반지름 *2
		System.out.println(Math.PI * radius * radius);
		System.out.println(Math.PI * radius * 2 );
		super.draw();
	}

//	public void draw() {
//		
//	}
	
	

}
