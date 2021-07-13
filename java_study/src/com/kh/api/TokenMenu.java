package com.kh.api;

import java.util.Scanner;

import com.kh.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	
	public TokenMenu() {
		// TODO Auto-generated constructor stub
	
	}
	
	public void mainMenu() {

		System.out.println("1.지정문자열");
		System.out.println("2.입력문자열");
		System.out.println("9.프로그램끝내기");
		System.out.println("메뉴 번호 입력하세요");
		int num = sc.nextInt();
		
		switch (num) {

		case 1:
			tokenMenu();
			break;

		case 2:
			inputMenu();

			break;

		case 9:

			System.out.println("프로그램을 종료");
			break;

		default:
			System.out.println("잘못입력하셨습니다. 다시 입력하세요");
			return;

		}
	}

	public void tokenMenu() {

		String str = "J a v a P r o g r a m ";
	
		// 위 str을 TokenController의 afterToken() 메소드의 인자로 보내 반환 값 출력 
		// 그 반환 값을 이용해 Token 처리 후 글자 개수와 대문자 변환한 것을 출력

		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		

		String str1 = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + str1 );
		System.out.println("토큰 처리 후 개수 : " + str1.length());
		System.out.println("대문자로 변환 : " + str1.toUpperCase());
		
	}
	
	public void inputMenu() {
		// 입력 받은 문자열을 TestController의 firstCap()의 인자로 보내 반환 값 출력
		// 찾을 문자 입력 받아 TestController의 findChar()의 매개변수로 아까 입력 받은
		// 문자열과 문자 하나를 매개변수로 보내 반환 값 출력
		

		System.out.println("문자를 입력하세요 :");
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println("첫글자 대문자 : " + tc.firstCap(str).substring(0,1) + str.substring(1));
		
		
		System.out.println("찾을문자 하나 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch + " 문자가 들어간 갯수 " + tc.findChar(str, ch));
		
		
		

		
	}
}
