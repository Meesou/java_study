package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	Scanner sc = new Scanner (System.in);
	
	public void method1() {
		
		System.out.println("이름");
		String name = sc.nextLine();
		System.out.println("나이");
		int age = sc.nextInt();
		System.out.println("성별");
		char gender = sc.next().charAt(0);
		System.out.println("키");
		double height = sc.nextDouble();
		
		System.out.println(name + age + gender + height );
		
	}
	
	public void method2() {
		
		System.out.println("첫번째정수입력");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수입력");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + num2 +" 두개를 더한값 ");
		System.out.println(num1 - num2 +" 두개를 뺀값  ");
		System.out.println(num1 * num2 +" 두개를 곱한값 ");
		System.out.println(num1 % num2 +" 두개를 나눈 몫 ");
		
	}
	
	public void method3() {
		
		System.out.println("가로");
		double w = sc.nextDouble();
		System.out.println("세로");
		double h = sc.nextDouble();
		
		System.out.println("면적 = "+ (w*h) + "둘레 = " + ((w+h)*2));
	}
	
	public void method4() {
		
		System.out.println("문자열을 입력하세요");
		String cha = sc.nextLine();
		
		System.out.println("첫번째문자 " + cha.charAt(0));
		System.out.println("두번째문자 " + cha.charAt(1));
		System.out.println("세번째문자 " + cha.charAt(2));
	}
}
