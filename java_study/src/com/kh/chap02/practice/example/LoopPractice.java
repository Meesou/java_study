package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	private Scanner sc = new Scanner(System.in);
	
	
	public void method12() { 
		
		while(true) { 
			
		System.out.println("연산자 (+,-,*,/,%) 종료를 원하신다면 exit 입력하세요 ");
		String cal = sc.nextLine();
		
		if(cal.equals("exit")) {
			System.out.println("프로그램종료");
			return;
		}
		
		System.out.println("정수1");
		int num1 = sc.nextInt();
		System.out.println("정수2");
		int num2 = sc.nextInt();
		
		if(cal.equals("/") && num1 == 0) {
			System.out.println("0으로 나눌수 없습니다 다시 입력해주세요");
			return;
		}
		
		double result = 0;
		
		switch(cal) { // 연산자 입력 받은
		
		case "+":
			result = num1 + num2;//덧셈 
		case "-":
			result = num1 - num2;
		case "%":
			result = num1 % num2; // 몫 나오는애 
		case "*":
			result = num1 * num2;
		case "/":
			result = num1 / num2; 
	//default:
			//System.out.println("없는 연산자 입니다. 다시 입력해주세요 ");
				
		}
		
		System.out.println(num1 + cal + num2 + "=" + result);
		
			
		}
		
		
	}
	public void method11() {
		
		//공차는 2, 7, 12, 17 일정한 숫자의 차이가 존재하는 것 
		
		System.out.println("시작숫자");
		int start = sc.nextInt();
		System.out.println("공차");
		int space = sc.nextInt();
		
		for(int i = 0; i < 10; i++) { //10번 도는 것 -> 10개 출력됨 
			 start = start + space;
			
			System.out.println(start);
		}
	}
	
	public void method10() {

		System.out.println("원하는 구구단 번호를 2~9 입력주세요 ");
		int num = sc.nextInt();
		
		
		if (num > 1 && num < 10) { //2에서 부터 9까지만 조건을 걸어서 1보다 크고 10보다 작아야됨 
			for (int i = 2; i <= 9; i++) {
				System.out.println("==" + i + "단 ==");
				for (int j = 2; j <= 9; j++) {
					System.out.println(i + "*" + j + " = " + i * j);
				}

			}
	
		}else {
			System.out.println("2-9까지의ㅡ 숫자만 입력해주세요 ");
		}
		
		
	}
	
	public void method7() {
		
		//1 이상의 숫자를 입력해주세요 1미만의 숫자가 입력되었다면 
		System.out.println("첫번째 숫자 1 ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자 2" );
		int num2 = sc.nextInt();
		
		//두번째 숫자부터 첫번째 숫자출력하기 
		
		if( num1 < 1 && num2 < 1 ) {
			
		}
		
		
	}
	
	public void method5() {
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int sum = 0; // 담을 변수 초기화 
		
		for(int i =0; i <= num; i++) {
			sum = sum +i;
		}
		System.out.println(sum); // 총합계 담김
		//1+2+3+4+5+6+7+.. 어케 나타내더라...생각을 해보자  
				
	}

}
