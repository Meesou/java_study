package mvc.controller;

import mvc.model.vo.Member;
import mvc.model.vo.Member0701;

public class MemberController0701 {
	
	public static final int SIZE = 10; // 최대 담을수있는 회원수 
	private int memberCount; // 현재회원수 필드 
	private Member0701[] mem = new Member0701[SIZE]; // 회원들 정보담는 객체배열 
	
	{
		
	mem[0] = new Member0701("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
	mem[1] = new Member0701("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
	mem[2] = new Member0701("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
	mem[3] = new Member0701("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
	mem[4] = new Member0701("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com"); 
	memberCount = 5;
	
	}
	
	public int getMemberCount() {
		return memberCount;
	}

	public Member0701[] getMem() {
		return mem;
	}
	
	public Member0701 checkId(String userId) {// 유저아이디 중복체크 하는건가 
	
		Member0701 m = null;// 아이디로 검색된 결과를 담을 변수 초기화
		// mem 에서 매개변수로 전달받은 userId와 동일한 아이디를 가지고 있는 회원을 m에 대입
		
		for(int i = 0; i < memberCount; i++) {
			if(mem[i].getUserId().equals(userId) {
				mem[i]
		

			}
		}
	
	}
	
	public void insertMember(Member0701 m) {
		// 매개변수로 전달받은 회원객체를 mem 배열에 추가 
		mem[memberCount]= m;
		memberCount++;
		
		//mem[m];
		// memberCount 1 증가
		
	}
	
	public Member0701 searchMember(int menu, String search) {
			
		Member0701 searchMember = null;
		
		// 매개변수로 전달받은 search
		//1,2,3인 경우 아이디로 검색후 결과를 searchMember에 대입하고..?
		
		//멤버 카운트만큼 for문을 돌려서 서치하면서 찾아준다. 
		
		
		if(menu == 1) {
		
		}else if(menu == 2) {
		
		}else if(menu == 3) {
		
		}
		
		
		
		return searchMember;
	}
	
	public void updateMember(Member0701 m, int menu, String update) {

		// 매개변수로 전달받은 m 회원과 변경 내용인 update 문자열을 menu에 따라
		// 1 인 경우 setter 메소드를 이용하여 m의 비밀번호를 update 문자열로 변경
		
		if(menu == 1) {
			m.setUserPwd(update);
		}else if (menu == 2) {
			m.setName(update);
		}else if ( menu == 3) {
			m.setEmail(update);
		}
		
		// 2 인 경우 setter 메소드를 이용하여 m의 이름을 update 문자열로 변경
		// 3 인 경우 setter 메소드를 이용하여 m의 이메일을 update 문자열로 변경
		
		
	}
	public void deleteMember(String userId) {
		
		for(int i = 0; i < memberCount; i++) {
			if(mem[i].equals(userId)) {
				
			}
			
		}
		
	
		// 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
		// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
		
		
		// 실행 시 NullPointerException 발생할 수 있음 -> 왜 그런지 생각해보고 해결하시오
		
		// memberCount 1 감소
			memberCount --;
		
	}
	
	public Member0701[] sortIdAsc() {
		// 기존의 회원 객체 배열(mem)을 변경하지 않고 단지 정렬된 결과만을 보여주기 위해
		// 기존의 배열 복사해서 사용 (clone(), System.arraycopy() 둘 중 하나 사용해서 복사) 
		//Member[] copy;
		Member0701 copy[] = new Member0701[SIZE];
		System.arraycopy(copy, SIZE, copy, memberCount, SIZE);
						//몇번째부터 들고 올껀지,
		mem.clone();
		
		// copy 배열을 아이디 별 오름차순 정렬 진행
		// --> HINT : String 클래스의 compareTo() 메소드 활용 // copy 주소 값 리턴

		return copy;
		
	}
	public Member0701[] sortIdDesc() {
		
		// 위와 동일한 방식이지만 내림차순으로 정렬 후 주소 값 리턴
		Member0701 copy[] = new Member0701[SIZE];
		System.arraycopy(copy, SIZE, copy, memberCount, SIZE);
	
		//배열의 내림차순공부하기.. 
		
		return copy;
	}
	
	public Member0701[] sortAgeAsc() {
		// 위와 동일한 방식이지만 나이별 오름차순 정렬 후 주소 값 리턴 
		// (숫자 비교이기 때문에 compareTo 사용X)
		Member0701 copy[] = new Member0701[SIZE];
		System.arraycopy(copy, SIZE, copy, memberCount, SIZE);
		
		return copy;

	}

	public Member0701[] sortAgeDesc() {
		// 위와 동일한 방식이지만 내림차순으로 정렬 후 주소 값 리턴
		Member0701 copy[] = new Member0701[SIZE];
		System.arraycopy(copy, SIZE, copy, memberCount, SIZE);
		
		return copy;

	}
	
	public Member0701[] sortGenderDesc() {
		// 위와 동일한 방식이지만 성별 별 내림차순으로 정렬 후 주소 값 리턴 // (남여 순으로 정렬)
		Member0701 copy[] = new Member0701[SIZE];
		System.arraycopy(copy, SIZE, copy, memberCount, SIZE);
		
		return copy;
		
	}
}
