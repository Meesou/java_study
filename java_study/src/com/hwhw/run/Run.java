package com.hwhw.run;

import java.io.IOException;
import java.util.Scanner;

import com.hwhw.model.vo.Employee;
import com.hwhw.model.vo.Student;

public class Run {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student[] stu = new Student[3];

		stu[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		stu[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		stu[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

		for(int i = 0; i< stu.length; i++) {
			
			System.out.println(stu[i].toString());
		
		}

		 Scanner sc = new Scanner(System.in);
		 Employee[] emp = new Employee[10];
		
		 int count = 0; //카운트 할 변수 선언 
		 
		while(true) {
			// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
			System.out.println("이름 입력 ");
			String name = sc.nextLine();

			System.out.println("나이를 입력");
			int age = sc.nextInt();

			System.out.println("키 입력");
			double height = sc.nextDouble();

			System.out.println("몸무게 입력");
			double weight = sc.nextDouble();

			System.out.println("월급을 입력");
			int salary = sc.nextInt();
			sc.nextLine(); // 버퍼빼줘야됨... 인트다음 스트링 입력할떄 버퍼 빼주셈 


			System.out.println("부서를 입력");
			String dept = sc.nextLine();
			
			// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
			// 한 명씩 추가 될 때마다 카운트함
			emp[count++] = new Employee(name,age,height,weight,salary,dept);
			
			System.out.println("계속 추가 하시겠습니까 y/n");
			char ch = sc.nextLine().charAt(0);
		
			
			if(ch == 'n' || ch =='N') {
				System.out.println("시스템을 종료합니다 ");
				break;
				
			}else if( ch == 'y' || ch == 'Y'){
					continue;
			}else {
				System.out.println("잘못입력하셨습니다");
				continue;
			}
			
		}
			for(int i = 0; i < count; i++) {
				System.out.println(emp[i].toString());
			
		}
	}

}
