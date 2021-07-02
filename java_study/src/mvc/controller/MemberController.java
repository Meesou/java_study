package mvc.controller;

import mvc.model.vo.Member;

public class MemberController {

	
	private Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0);
	//객체 동시에 초기화 하기 
	
	public MemberController() {
		// TODO Auto-generated constructor stub

	}

	public int login(String id, String pwd) {

		// int result = 0;

		if (mem.getMemberId().equals(id) && mem.getMemberPwd().equals(pwd)) {
			System.out.println("로그인성공");

			return 1; // 모두 같으면 1을 리턴
		}

		return 0; // 아니면 0을 리턴한다

	}
	
	public Member readInfo() {
		return mem; //mem 주소값 리턴 
		
	}
	
	public int readAge () {
		// mem의 주민번호의 앞 2자리를 추출해서 출생년도를 알아낼 것
		//HINT : String클래스의 substring() 메소드, Integer클래스의 parseInt() 메소드 참고 
		// 나이 = 올해년도 – 출생년도 + 1 ( 어떤 조건이 필요한지 생각해보시오 )
		// 구한 나이 값 리턴
	
		String ssin = mem.getCitizenNo().substring(0,2); // 자바랑 sql 헷갈리지마
		int year =  Integer.parseInt(ssin); 
			year = 121 - year; 

		return year; 
		
	}
	
	public void updateHeight (double height) {
		
		mem.setHeight(height); 
		
		// 멤버에서 전달 받은 height값으로 mem의 height값 수정
	}

}
