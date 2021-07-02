package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		int count = 0; // 학생 수를 나타내는 변수 한 명 추가 시 1씩 증가시켜줄꺼임

		Student stu[] = new Student[10];

		// while(true)을 사용하여 학생들의 정보를 계속 입력 받고

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine(); // 버퍼빼주기

			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			
			System.out.println("계속 추가하시겠습니 y/n");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'n' || ch == 'N') {
				System.out.println("종료합니다");
				break;
			
			}

			// 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체 생성
			for (int i = 0; i < stu.length; i++) {
				stu[i] = new Student(grade, classroom, name, kor, eng, math);
				//System.out.println(stu[i]);
			}

		
			for (int i = 0; i < stu.length; i++) {
				int sum = stu[i].getKor() + stu[i].getMath() + stu[i].getEng();
				System.out.println(stu[i].toString() + ", 평균 = " + sum / 3);

			}
			// 3명의 학생 정보를 입력 받아, 각 객체에 저장,
			// 현재 기록된 학생들의 정보와 각 학 생의 평균 점수를 출력

		}

	}

}
