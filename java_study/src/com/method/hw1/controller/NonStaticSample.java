package com.method.hw1.controller;

import java.util.Arrays;

public class NonStaticSample {

	
	
	public void printLottoNumbers() {
		//1~45까지의 임의의 정수 6개 (중복x) 출력
		
		int[] random = new int[6];

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 45 + 1);

			//중복제거 
			for (int j = 0; j < i; j++) {
				if (random[i] == random[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(random);
		System.out.println(Arrays.toString(random)); // 오름차순 
		
	}
							
	public void outputChar(int num, char c) {
		// 매개변수로 전달받은 문자 c를 
		// num 갯수 만큼 출력하는 메소드
							//이거의 갯수만큼 
		for(int i = 0; i <= num; i++) {
			
			System.out.print(c);
			
		}
		
	}
	
	public char alphabette() {
		
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		
		int ap = (int)(Math.random() * 56 + 65); //랜덤으로 
		
		return (char) ap;
		//임의 문자 리턴 
		
	}
	public String mySubstring(String str, int index1, int index2 ) {
		
		// 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		
		String str1 = null;
		
		str1 = str.substring(index1,index2);
		
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
		
		return str1;
		
	}
}
