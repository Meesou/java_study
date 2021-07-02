package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController;

public class MemberView {
	
	private Scanner sc = new Scanner(System.in); //초기화 
	private MemberController mc = new MemberController();
	// 초기화 


	public MemberView() {
		// TODO Auto-generated constructor stub
	}
/*
 * 
 * 로그인을 위해 아이디와 비밀번 호를 sc를 통해 입력 받고 로그인 성공하면 회원 프로그램 에 해당하는 메인 메뉴 출력 (메인 메뉴는
 * 반복출력), 각 메뉴를 선택했을 때 해당하는 MemberController 클래스의 메 소드 및 MemberView 클래스의 메소드 실행
 */
	
	public void mainMenu() {
	
		
			System.out.println("아이디를 입력하세요");
			String id = sc.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String pw = sc.nextLine();
			
		int result = mc.login(id, pw);
		// 입력받은 아이디, 비밀번호 값을
		// MemberController 클래스의 login 메소드에 전달하고 그 결과값을 result변수에 받는다.

				
		
		// 성공적으로 로그인 했을 경우 => 즉, result 변수 값이 1일 경우 아래의 메뉴출력 
		
		if(result == 1) {
			
			while(true) { // 무한 반복 
			
			System.out.println("== 회원 프로그램 ==");
			System.out.println("1.내정보보기");
			System.out.println("2.내나이조회하기");
			System.out.println("3.키 수정하기");
			System.out.println("9.프로그램종료");
			
			System.out.println("메뉴선택 : ");
			int num = sc.nextInt();
			
			switch(num) {

			case 1:
				System.out.println(mc.readInfo());
				break;
			case 2:
				System.out.println( mc.readAge());
				break;
			case 3:
				updateHeight();
				break; // 멤버뷰에 있는거
			case 9:
				System.out.println("프로그램을 종료합니다 ");
				return;
			}

		}
	} else {
		System.out.println("잘못입력하셨습니다. 다시 입력해주세요 ");
		return;
	}

}

		public void updateHeight() {
		
			System.out.println("수정할 키를 입력하세요 :");
			double height = sc.nextDouble();
			
			mc.updateHeight(height);
		   }
		}
