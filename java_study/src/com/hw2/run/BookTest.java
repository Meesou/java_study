package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b = new Book();
		Book b1 = new Book("자바의정석",20000,0.2,"윤상섭");
		Book b2= new Book("C언어",30000,0.1,"홍길동");
		
		System.out.println(b.toString());
		System.out.println(b1.toString());

		// 첫 번째 객체가 가진 값을 setter를 이용하여 수정 
		// 수정된 내용 출력 확인
		
		
		// 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 할인된 가격 = 가격 – (가격 * 할인율) }
		
		double pr1 = b1.getPrice() - (b1.getPrice() * b1.getDiscountRate());
		double pr2 = b2.getPrice() - (b2.getPrice() * b2.getDiscountRate());
		

		System.out.println("도서명 = " + b1.getTitle());
		System.out.println("할인된가격  = " + pr1  + " 원");
		

		System.out.println("도서명 = " + b2.getTitle());
		System.out.println("할인된가격  = " + pr2  + " 원");
		
	}

}
