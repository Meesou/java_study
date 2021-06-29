package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;

public class EmpMenu {

	private Scanner sc = new Scanner(System.in);
	
	public EmpMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		
		Employee emp = null;
		
		while(true) {
		
		System.out.println("============사원관리프로그램===========");
		System.out.println("1. 새 사원 정보 입력");
		System.out.println("2. 사원 정보 수정");
		System.out.println("3. 사원 정보 삭제");
		System.out.println("4. 사원정보 출력");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();

		switch (menu) {

		case 1:
			emp = inputEmployee();
			break;
		case 2:
			modifyEmployee(emp);
			break;
		case 3:
			emp = null;
			break;
		case 4:
			System.out.println(emp.toString());
			break;

		case 9:
			System.out.println("시스템을종료합니다");
			return; // 값
		}

	}
}
	
	public Employee inputEmployee() {
		
		System.out.print("이름 : ");
		String empName = sc.nextLine();
		
		System.out.print("부서 : ");
		String dept = sc.nextLine();
		
		System.out.print("직급 : ");
		String job = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();		
		
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);		
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();		
		
		System.out.print("보너스포인트 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();		
		
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		 Employee emp = new Employee(empName, dept, job, age, gender,salary, bonusPoint,phone,address) ;
		 
			return emp;
		}

//	String st = new String();
									//틀 Employee  그 결과물 emp
		public void modifyEmployee(Employee emp) { // 얘 받은애가 붕어빵임 

			//매개변수도 지역변수 
			while (true) {

				System.out.println("==== 사원 정보 수정 메뉴 ====");
				System.out.println("1. 이름 변경");
				System.out.println("2. 급여 변경");
				System.out.println("3. 부서 변경");
				System.out.println("4. 직급 변경");
				System.out.println("9. 이전 메뉴로");
				System.out.print("메뉴 선택 : ");
				int menu = sc.nextInt();
				sc.nextLine();

				switch (menu) {

				case 1: System.out.println("변경할이름을쓰시오"); 
					emp.setEmpName(sc.nextLine());
					break;
				case 2: System.out.println("변경할꺼쓰셈");
				   emp.setSalary(sc.nextInt());
				   sc.nextLine();
				   	break;
				case 9: System.out.println("시스템을종료합니다");
					return; // 값도 반환시켜주지만 값이 아닌경우 바로 종료를 시켜준다.
				   	
				}
			}
		}

	}
