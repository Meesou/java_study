package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice { // 연산자 
	
	private Scanner sc = new Scanner(System.in);
	
	
	public void method1() {
		//키보드로 입력받은 하나의 정수가 양수이면 양수 아니면 양수가 아니다로출력
		
		System.out.println("숫자를 입력하세요 ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");

		}
	}

	public void method2() {
		
		System.out.println("숫자 입력");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수");
		} else if (num % 2 == 1) {
			System.out.println("홀수");
		}
	}
	public void method3() {
		
		System.out.println("인원수 :");
		int p = sc.nextInt();
		System.out.println("사탕수");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕개수 " + candy / p);
		System.out.println("남은 사탕개수" + candy % p);
		
	}
	
	public void method4() {
		
		System.out.println("이름입력");
		String name = sc.nextLine();
		
		System.out.println("학년");
		int grade = sc.nextInt();
		
		System.out.println("반");
		int clas = sc.nextInt();
		
		System.out.println("번호");
		int num = sc.nextInt();

		System.out.println("성적");
		double score = sc.nextDouble();
		sc.nextLine(); // 넥스트라인 엔터값을 입력해버림 넥스트 더블다음에 넥스트 라인이 오면 중간에 버퍼를 뺴줘야됨 
						//숫자 뒤에 문자를 입력받을때 쓰라 
		
		System.out.println("성별 F/M ");
		char gender = sc.nextLine().charAt(0);
		
		//오류 왜나지 

		if (gender == 'M'||gender == 'm') {
			System.out.println("남학생");
		}else if(gender == 'F' || gender =='f' ){
			System.out.println("여학생");
		}
		
		
		System.out.println(grade +"학년" + clas + "반 "+ gender + name+"은" + "성적이 " + score +"이다 ");
	}
	
	
	public void method6() {

		System.out.println("나이 입력하세요");
		int age = sc.nextInt();

		if (age <= 13) {
			System.out.println("어린이");

		} else if (age > 13 && age <= 18) {
			System.out.println("청소년");

		} else {
			System.out.println("성인");

		}
	}
	
	public void method7() {
		//국어 영어 수학 성적 합계랑평균 합격여부 
		
		System.out.println("국어");
		int k = sc.nextInt();
		System.out.println("수학");
		int m = sc.nextInt();
		System.out.println("영어");
		int e = sc.nextInt();
		
		double sum = k + m + e;
		double avg = sum /3;
	
		System.out.println("평균 " + (int)avg +"총점 " + sum );
		
		if( k >= 40 && m >= 40 && e>=40 && avg >= 60 ) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
		
	}
	
	public void method8() {
		
		System.out.println("주민번호 입력하세요(- 포함 )");
		String num = sc.nextLine();

		char num1 = num.charAt(7); //0 부터 주의 

		if (num1 == '1') {
			System.out.println("남");

		} else if (num1 == '2') {
			System.out.println("여");
		}

	}
	public void method9() {
		
		System.out.println("정수1");
		int num1 = sc.nextInt();
		System.out.println("정수2");
		int num2 = sc.nextInt();
		System.out.println("입력");
		int input = sc.nextInt();
		
		//num1 이하거나 num2 초과면 true
		//입력할때 num1 은 num2 보다 작아야됨 
		System.out.println((input <= num1) || (input > num2));
		
	}
	public void method10() {
		
		
		System.out.println("입력 1");
		int num1 = sc.nextInt();
		System.out.println("입력 2");
		int num2 = sc.nextInt();
		System.out.println("입력 3"); 
		int num3 = sc.nextInt();
		
		if( num1 == num2 && num2 == num3 ) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}
	
	public void method11() {
		
		
		
		System.out.println("a사원의 연봉 ");
		double sal = sc.nextDouble() ; //* 1.4;
		System.out.println("b사원의 연봉");
		double sal1 = sc.nextDouble();
		System.out.println("c 사원의 연봉 ");
		double sal2 = sc.nextDouble() ; //* 1.15;
		
		
		double personA = sal * 1.4;
		double personB = sal1;
		double personC = sal2 * 1.15;
		
		
		if(personA >= 3000 ) {
			System.out.println("a사원 3천 이상 ");
		}else if(personA <3000) {
			System.out.println("a사원 3천 미만 ");
			
		}
		
		if(personB >= 3000) {
			System.out.println("b사원 3천 이상 ");
		}else if(personB <3000) {
			System.out.println("b사원 3천 미만 ");
			
		}
		
		if(personC >= 3000) {
			System.out.println("c사원 3천 이상 ");
		}else if(personC < 3000) {
			System.out.println("c사원 3천 미만 ");
			
		}
	}
	
}
