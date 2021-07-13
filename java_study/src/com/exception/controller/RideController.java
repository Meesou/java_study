package com.exception.controller;

import com.exception.model.vo.Guests;
import com.exception.model.vo.RollerCoaster;

public class RideController {


	public void cutGuests() {
		
		// 4명의 탑승 대기자를 생성자를 통한 Guest객체 배열 초기화 (Guests[] gs) 
		
		Guests[] gs = new Guests[4]; 
	
		gs[0] = new Guests("홍길동", 17, 'M', 120.2);
		gs[1] = new Guests("유관순", 20, 'F', 102.3);
		gs[2] = new Guests("김유신", 23, 'M', 110.4);
		gs[3] = new Guests("김흥부", 21, 'M', 112.5);
	
		
		// RollerCoaster 클래스의 허용인원 상수값 크기의 또 다른 객체 배열 생성 
		// (Guests[] onBoard)
		
		Guests[]onBoard = new Guests[RollerCoaster.PERMITNUMBER]; // 수용할수있는 인원까지 담는 곳 

		// for문과 if문을 통해 RollerCoaster 클래스의
	
		int person = 0; //사람 담을 변수  

		try {

			for (int i = 0; i < gs.length; i++) { // 허용인원만큼 돌리고
				if (gs[i].getHeight() > RollerCoaster.CUTHEIGHT) { // 만약 키 제한이 걸린다면
					// 허용키 상수값 크기 이상인 사람을 Guests객체 배열 onBoard에 담는다.
					onBoard[person] = gs[i];
					person++; // 사람수 증가시킴
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) { // 배열크기를 넘어가면 예외처리하는 예외처리하셈
			// 문제가 발생한 해당 배열의 인덱스 번호가 몇번에서 발생하는지
			// Throwable클래스의 getMessage()메소드를 통해 출력
			System.out.println("문제가 발생한 해당 배열의 인덱스 번호 " + e.getMessage()); // Throwable.getMessage가 아님
		} finally {
			// "인원이 가득 찼습니다. 다음 차례를 기다리세요"
			// "이번 차례 탑승 명단"
			// 탑승자 각각의 이름, 키를 출력하고 두 탑승자의 요금합계를 출력 하시오
			System.out.println("인원이 가득 찼습니다 다음차례를 기다리세요");
			System.out.println("이번 차례 탑승명단 ");

			for(int i = 0; i < onBoard.length; i++) {
				//보드에 올러간 사람들을 for문을 돌리면서 출력함
				System.out.println("이름 : " + onBoard[i].getName() + "키 : " + onBoard[i].getHeight());
				
			}
			System.out.println("탑승자 요금 : " + RollerCoaster.PRICE * person ); // 인당 요금 
		
	}
	
		
		
	}
	

}
