package com.kh.controller;

import java.util.StringTokenizer;

public class TokenController {

	//스플릿은 객체 배열에 담아 준다. 
	
	public String afterToken(String str) {
		//공백을 토큰으로 처리 한 글자 반환
		
		StringTokenizer st = new StringTokenizer( str ,  " "); 
		
		String result = "";
		
		while(st.hasMoreTokens()) {// 커서다음에 토큰이 있는지 확인한다.	
			String whStr = st.nextToken();// 문자열을 하나씩 빼온다.
		//	System.out.println(st.countTokens()); //토큰갯수 리턴 
			result += whStr; // 빼온 토큰값을 스트링에 담아줌 
		}
		
		return result; 
	}


	public String firstCap(String input) {	
		//매개변수로 받은 문자열의 첫 번째 글자를 대문자로 바꾼 문자열 반환
		
		String put = input.toUpperCase();
		
		return put;
	}

	public int findChar(String input, char one) {
		//매개변수로 받은 문자열 중에서 매 개변수로 들어온 문자가 몇 개 존재 하는지 개수를 반환
		
		int num = 0; //리턴 담을 애 선언
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i)== one) {
				num++;
			}
		}
		
		return num;
		
	}
}
