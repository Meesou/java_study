package mvc.view;

import java.util.Scanner;

import mvc.controller.MemberController0701;
import mvc.model.vo.Member0701;

public class MemberMenu0701 {

	private MemberController0701 mc = new MemberController0701();	
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬"); 
			System.out.println("9. 프로그램 종료");
			
			int input = sc.nextInt();
			
			switch(input) {
			
			case 1: insertMember(); break;
			case 2: searchMember(); break;
			case 3: updateMember(); break;
			case 4: deleteMember();break;
			case 5: printAllMember(); break;
			case 6: sortMember(); break;
			case 9: 
				System.out.println("시스템을 종료합니다");
				return;
			}
			
		}
		
	}
	
	public void insertMember() {

		// 1. 현재 회원 수(memberCount)가 최대 회원 수(SIZE)를 넘어설 경우 return 처리
		// MemberController의 getMemberCount() 메소드를 통해 현재 회원 수 알아오고
		//최대 회원 수는 상수필드여서 클래스명. 으로 직접 접근 가능..?
		
		System.out.println("현재회원수: "+  mc.getMemberCount());  
		
		
		// 2. 아이디를 입력 받아 MemberController의 checkId() 메소드로 전달 >> 결과 값 받기
		// (아이디 중복 체크하는 과정)
		System.out.println("아이디입력하세요");
		String id = sc.nextLine();
		
			mc.checkId(id);
		

		// 2_1. 결과 값이 null이 아닌 경우 즉, 동일한 아이디가 존재하는 경우
		// “동일한 아이디가 존재합니다. 회원등록 실패” 출력
			
			if(mc.checkId(id).equals(id)) {
				System.out.println("동일한 아이디가 존재합니다, 회원등록 실패 ");
			}
				
		
		// 2_2. 결과 값이 null인 경우 즉, 동일한 아이디가 존재하지 않는 경우
		// 나머지 회원 정보 입력 받도록 (비밀번호, 이름, 나이, 성별, 이메일)
			if(mc.checkId(id) == null) {
				
				System.out.println("비밀번호 입력 ");
				String pw = sc.nextLine();
				System.out.println("이름 입력 ");
				String name = sc.nextLine();
				System.out.println("나이 입력 ");
				int age = sc.nextInt();
				System.out.println("성별 입력 ");
				char gender = sc.nextLine().charAt(0);
				System.out.println("이메일 입력 ");
				String email = sc.nextLine();
				

				// 입력 받은 정보를 Member의 매개변수 생성자를 이용하여 객체 생성 후
				Member0701 m = new Member0701(id,pw,name,age,gender,email);
				
				// MemberController의 insertMember() 메소드로 전달
				mc.insertMember(m);
				
				// “성공적으로 회원 등록이 되었습니다.” 출력
				System.out.println(" 성공적으로 회원이 등록이 되었습니다. ");
			}
		
		
	
	}
	
	public void searchMember() {
		
		while(true) {
		System.out.println("====== 회원 정보 검색 ======");
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 이전 메뉴로");
		
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		
		System.out.println("검색내용");
		String search = sc.nextLine();
		
		// 1. MemberController의 searchMember() 메소드로 menu와 search 문자열 전달 >> 결과 값
		Member0701 result = mc.searchMember(menu, search);
		
		//1_1. 결과 값이 null인 경우 즉, 검색 결과가 없는 경우 >>“검색된 결과가 없습니다.” 출력
		
		if(result == null) {
			System.out.println("검색된 결과가 없습니다 ");
		}
		
		// 1_2. 결과 값이 null이 아닌 경우 즉, 검색 결과가 존재하는 경우 >> 회원 정보 출력

		if (result != null) {
			System.out.println(mc.toString());
		}
		
		if(menu == 9) {
			System.out.println("이전으로돌아가");
			return;
			
		}

	}

}
	
	public void updateMember() {

		while (true) {
			
			System.out.println("====== 회원 정보 수정 ===== ");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");

			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();

			System.out.println("변결할 회원아이디");
			String id = sc.nextLine();
		
		/*
		 * 
		1. MemberController의 checkId()로 userId 전달 >> 결과 값 (m : Member) 
		1_2. 결과 값이 null인경우 >> “변경할 회원이 존재하지 않습니다” 출력
		1_2. 결과 값이 null이 아닌 경우 기존 정보 출력 후
				변경내용(update : String) 입력 받고
		MemberController의 updateMember()에 m, menu, update 전달 “회원의 정보가 변경되었습니다.” 출력
		 * */
		
		Member0701 m = mc.checkId(id);

		if (m == null) {
			System.out.println("변경할 회원이 존재하지 않습니다 ");

		}
		if (m != null) {
			System.out.println(mc.toString()); // 기존 정보 출력

			System.out.println("변경할 아이디 입력하세요 ");
			String update = sc.nextLine();

			mc.updateMember(m, menu, update);

			System.out.println("회원정보가 변경되었습니다 ");

		}

	}
}

	
	public void deleteMember() {
		
		System.out.println("삭제할 회원 아이디 ");
		String id = sc.nextLine();
		
		// 1. MemberController의 checkId()에 userId 전달 >> 결과 값 (m : Member) 
		Member0701 m = mc.checkId(id);
		
		// 1_1. 결과 값이 null인 경우 “삭제할 회원이 존재하지 않습니다.” 출력
		
		if( m == null) {
			System.out.println("삭제할외원이 존재하지않습니다 ");
		}
		
		//1_2. 결과 값이 null이 아닌 경우 기존 정보 출력
		
		if(m != null) {
			System.out.println(mc.toString());
		}
		
		System.out.println("정말삭제하시겠습니까? y/n");
		char ch = sc.nextLine().charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			mc.checkId(id);
			System.out.println("회원정보가 삭제되었습니다 ");
		}
		// “정말 삭제하시겠습니까? (y/n) : “ >> 키보드로 입력 받기
		// 대소문자 구분 없이 ‘Y’인 경우 MemberController의 deleteMember()에 userId 전달
		// “회원의 정보가 삭제되었습니다.” 출력
		
		
	}
	
	public void printAllMember() {
		// MemberController의 getMem() 메소드 호출 >> 결과 값 (mem : Member[]) 
		Member0701 [] mem = mc.getMem();
		// 반복문을 통해 결과 값 안의 존재하는 회원들 정보 출력
		for(int i = 0; i < mem.length; i++) {
			System.out.println(mem[i].toString());
		}
		
	}
	
	public void sortMember() {
		
		Member0701[] sortMem = null;
		// 정렬 결과를 받아 줄 객체배열 초기화

		while (true) {
			System.out.println("====== 회원 정보 정렬 ===== ");
			System.out.println("1. 아이디 오름차순 정렬");
			System.out.println("2. 아이디 내림차순 정렬");
			System.out.println("3. 나이 오름차순 정렬");
			System.out.println("4. 나이 내림차순 정렬");
			System.out.println("5. 성별 내림차순 정렬 (남여 순)");
			System.out.println("9. 이전 메뉴로");

			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: sortMem = mc.sortIdAsc(); break;
			case 2: sortMem = mc.sortIdDesc(); break;
			case 3: sortMem = mc.sortAgeAsc(); break;
			case 4: sortMem = mc.sortAgeDesc(); break;
			case 5: sortMem = mc.sortGenderDesc(); break;
			case 9: 
				System.out.println("이전메뉴로 ");
				return;
				
			}
			// 반복문을 통해 sortMem 객체 배열 출력
			
			for( int i = 0; i < sortMem.length; i++) {
				System.out.println(sortMem[i].toString());
			}
			
		}
		
	
	}



}
