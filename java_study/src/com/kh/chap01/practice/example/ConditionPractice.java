package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	private Scanner sc = new Scanner(System.in);

	public void method5() {

		System.out.println("아이디를 입력하세요 ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String pw = sc.nextLine();

		String uId = "user1";
		String uPw = "1234";

		if (uId.equals(id) && uPw.equals(pw)) {
			System.out.println("로그인 성공 ");
		} else if (uPw.equals(pw)) {
			System.out.println("아이디 틀림 ");
		} else if (uId.equals(id)) {
			System.out.println("비번 틀림 ");
		}else {
			System.out.println("둘다틀림 ");
		}

		
		//else 안에도 if문 중첩이 가능하다 !!
		
	}

	public void method6() {
		// 사용자에게 관리자,회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한 출력하기

		System.out.println("권한을 확인하고자 하는 회원 등급");
		String degree = sc.nextLine();

		switch (degree) { //string , char, int 만 가능하다 

		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글작성, 게시글 조회");
			break;
		case "회원":
			System.out.println("게시글작성, 게시글 조회, 댓글작성 ");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;

		default:
			System.out.println("잘못입력하셨습니다.");
			break;

		}

	}

	public void method7() {

		System.out.println("키 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.println("몸무게 입력하세 : ");
		double weight = sc.nextDouble();

		//단위변환 신경 잘쓰기 
		double bmi = weight / (height * height);
		

		if (bmi < 18.5) {
			System.out.println("저체중");

		} else if (bmi < 23 ) {
			System.out.println("정상체중");
		} else if ( bmi < 25) {
			System.out.println("과체중 ");
		}else {
			System.out.println("고도비만");
		}

		System.out.println("BMI 지수 " + bmi);

	}

	public void method8() {

		System.out.println("피연산자1 입력 : ");
		int num1 = sc.nextInt();

		System.out.println("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("연산자 입력 (+,-,*,/,%)");
		char cal = sc.nextLine().charAt(0);

		//왜 결과값이안나오냐 스트링은 이퀄로 비교를 해야됨 
		if (cal == '+') {
			int result = num1 + num2;
			//System.out.printf("%d + %d = %d", num1, num2, result);
			System.out.println(num1 + " + " + num2 + " = " + result);

		} else if (cal == '-') {
			int result1 = num1 - num2;
			//System.out.printf("%d - %d = %d", num1, num2, result1);
			System.out.println(num1 + " - " + num2 + " = " + result1);

		} else if (cal == '*') {
			int result2 = num1 * num2;
			//System.out.printf("%d * %d = %d", num1, num2, result2);
			System.out.println(num1 + " * " + num2 + " = " + result2);

		} else if (cal == '/') {
			int result3 = num1 / num2;
			//System.out.printf("%d / %d = %d", num1, num2, result3);
			System.out.println(num1 + " / " + num2 + " = " + result3);

		} else if (cal == '%') {

			int result4 = num1 * num2;
		//	System.out.printf("%d % %d = %d", num1, num2, result4);
			System.out.println(num1 + " % " + num2 + " = " + result4);

		}else {
			System.out.println(" 연산자를 잘못입력하셨습니다 ");
		}

	}

	public void method9() {

		System.out.println("중간고사 점수 : ");
		int midscore = sc.nextInt();
		System.out.println("기말고사 점수 : ");
		int finscore = sc.nextInt();
		System.out.println("과제 점수 :");
		int hw = sc.nextInt();
		System.out.println("출석 회수 : ");
		int ck = sc.nextInt(); // 20일 기준 만점

		System.out.println("=======결과========"); // 100만점 기준으로 만들어준거
		double mid = midscore * 0.2;
		double fin = finscore * 0.3;
		double hw1 = hw * 0.3;
		double ck1 = ck; // * 0.2;

		double total = mid + fin + hw1 + ck1;


		if (total >= 70 && ck1 >= 20 * 0.7) { // 둘다 만족했을 경우
			
			System.out.println(" 중간고사 점수 : (20)" + mid);
			System.out.println(" 기말고사 점수 : (30)" + fin);
			System.out.println(" 과제 점수 : (20)" + hw1);
			System.out.println(" 출석 점수 : (20)" + ck);
			System.out.println("총점 : " + total);
			
			
			System.out.println("pass");
		} else if (total >= 70 && ck1 < 20 * 0.7) { // 출석 횟수 부족했을 경우
			System.out.println("fail 출석횟수 부족 (" + ck1 + "/20) ");
			
		} else if (total < 70 && ck1 > 20 * 0.7) { // 점수만 부족했을 경우
			System.out.println("Fail 점수미달 (총점 " + total + ")");
			
		} else if (total < 70 && ck1 < 20 * 0.7) { // 둘다 부족한경우
			System.out.println("출석회수 부족 (" + ck1 + "/20 )");
			System.out.println("점수 미달 총점 :  " + total);

		}

	}

}
