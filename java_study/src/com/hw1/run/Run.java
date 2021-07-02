package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		3명의 사원 정보를 배열을 통해 생성한 후 출력 해보고
		객체들 중 값이 없는 필드에는 setter를 통 해 각각 값을 수정한 후 다시 출력
		직원 각각의 보너스가 적용된 연봉을 계산 하여 출력하고 총 직원 연봉의 평균을 구 하여 출력
*/		
		Employee emp [] = new Employee[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", null, null, 19, 'M', 0, 0.0, "01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		System.out.println(emp[0].toString());
		System.out.println(emp[1].toString());
		System.out.println(emp[2].toString());
		
		System.out.println("=====================");
		emp[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
		emp[1] = new Employee(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");

		
	// 보너스가 적용된 연봉 =(급여 +(급여 * 보너스포인트))*12
		int sal =(int) ((emp[0].getSalary() + emp[0].getSalary() * emp[0].getBonusPoint())*12);
		int sal2 =(int) ((emp[1].getSalary() + emp[1].getSalary() * emp[1].getBonusPoint())*12);
		int sal3 =(int) ((emp[2].getSalary() + emp[2].getSalary() * emp[2].getBonusPoint())*12);
		

		System.out.println("김말똥의 연봉 : " + sal + "원");
		System.out.println("김말똥의 연봉 : " + sal2 + "원");
		System.out.println("김말똥의 연봉 : " + sal3 + "원");
		
		System.out.println();
		
		int total = (sal + sal2 + sal3) / 3;
		System.out.println("직원들의 평균연봉 : " + total + "원");

		
	}

}
