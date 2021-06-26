package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	//배열 문제 
	private Scanner sc = new Scanner(System.in);

	/*
	 * “월“ ~ “일” (요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
	 *  입력한 숫자와 같은 인덱스에 있는 요일을
	 * 출력하고 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
	 */
	public void method6() {
		
		String [] arr = {"월","화","수","목","금","토","일"};
		
		System.out.println("0~6 사이의 숫자 입력 ");
		int day = sc.nextInt();
		

			if (day >= 0 && day <= 7) {
				System.out.println(arr[day] + "요일");
			} else {
				System.out.println("잘못입력하셨습니다");
			}
		
	}
	
	public void method5() { // 이것도 굉장히 어렵네 ㅠ 
		
		String apl = "application";
		System.out.println(apl.indexOf("i"));
		System.out.println(apl.indexOf("i"));
		
		
		System.out.println("문자열 : ");
		String st = sc.nextLine();
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[st.length()];
		//문자열에 입력될 길이만큼 담길 배열 생성함 
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = st.charAt(i);
			//arr[0]~arr[배열의길이만큼담는다 ] = st.charAt(i 길이만큼)
			//arr[1] = st.charAt[1]
		}
		int count = 0; // 검색할 문자가 문자열에 몇개가 들어있는지를 세어줄 변수
		
		//인덱스의 위치를 확인해줘야됨 
		System.out.println(st + "에" + ch + "존재 위치 인덱스 확인 ");
		//담긴거 확인 
		//인덱스마다 접근하기 위해서 반복문을 사용함
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.println(i + " ");
				
				count++;
			}

		}
		System.out.println();
		System.out.println(ch + "개수 : " + count);
	}

	
	public void method3() {
		//사용자에게 입력 받은 정수만큼 배열크기 할당 
		System.out.println("양의정수 : ");
		int num = sc.nextInt();
		
		//1부터 입력 받은 값까지 배열에 초기화
		int [] arr = new int[num];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = i + 1; // 0	부터니까 플러스 1해줘야됨 
			System.out.print(arr[i] + " ");
			
		}
		
	}
	
	public void method7() {
		
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 
		 * 배열을 선언 및 할당하고 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의
		 * 인덱스에 값을 초기화 하세요. 
		 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 */
		
		System.out.println("정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째에 넣을 인덱스 값 :  ");
			arr[i] = sc.nextInt(); // 각인덱스에 넣을 값을 받음 
		}
		//총합을 구해야되는데 
		int total = 0;
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
			total = arr[i] + arr[i];
		}
		System.out.println();
		System.out.println("총합 : " + total);
	}
	
	
	public void method14() {
		//로또 중복없이 자동생성기
		
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			// System.out.print(lotto[i] + " ");

			// 중복값 없애기
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		//오름차순정렬 
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	
		
	}
	
	public void method12() {
		//10개의 난수 , 중복값 없이
		
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			// 중복제거
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
			// System.out.print(arr[i] + " "); //왜 이상하게 나오지
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void method13() {
		
		System.out.println("주민등록번호 입력 (-)포함 ");
		String ssin = sc.nextLine(); 
	
		//- 포함 14자리 
		
		char[] arr = new char[ssin.length()]; // 입력받은 길이만큼 배열에 담아준다
		for (int i = 0; i < arr.length; i++) {
			
			if (i < 8) {
				arr[i] = ssin.charAt(i);
			} else {
				arr[i] = '*';
			}

			System.out.print(arr[i]);

		}


//		//뭔가 substring 쓰면 될거같은데 - 하나의 값만 저장할수있기에 
//		char [] copy = Arrays.copyOf(arr, arr.length); //위의 배열을 복사 
//		
//		for(int i =0; i < arr.length; i++) {
//		//	arr[i] = ssin.substring(8,14); char 형이라 쓸수없음 
//		}
//		
////		char [] copy1 = arr.clone();
////		System.out.println(copy1);
////		
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrayPractice().method12();
	}
	


}
