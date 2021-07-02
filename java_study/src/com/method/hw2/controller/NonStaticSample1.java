package com.method.hw2.controller;

public class NonStaticSample1 {

	public int[] intArrayAllocation(int length) {
		// 전달받은 정수 length 길이 만큼 배열 할당
		int[] num = new int[length];

		// 임의의 1부터 100까지의 값으로 값을 기록하고 배열 주소 리턴
		for (int i = 0; i < num.length; i++) {
			int rd = (int) (Math.random() * 100 + 1);

			num[i] = rd;

		}
		return num;

	}

	public void display(int[] arr) {
		//전달받은 배열을 출력하기 

	}

	public void swap(int[] arr, int idx1, int idx2) {
		//전달받은 배열, 인덱스들을 통 해 각각의 인덱스 값을 교환
		
		
	}

	public void sortDescending(int[] arr) {
		//전달받은 배열을 내림차순으로 출력  (swap(), display() 메소드 이용)

	}

	public void sortAscending(int[] arr) {
		// 위의 swqp 메소드를 이용하여 전달받은 배열을 오름차순 적용 
		// 위의 display 메소드를 이용하여 출력

	}

	public int countChar(String str, char c) {
		// 문자열과 문자 하나를 전달받아 문자열에 포함된 문자의 갯수 리턴
	}

	
	public int totalValue(int num1, int num2) {
		// 정수 두 개를 전달받아 두 수 중 작은 값에서 큰 값 사이의 정수들의 합계를 리턴 
		// (단, 전달받은 두 정수는 포함되지 않아야된다.)
	

	}

	public char pCharAt(String str, int index) {
		// 전달받은 문자열의 인덱스를 통해 해당 인덱스의 문자 리턴


	}

	public String pConcat(String str1, String str2) {
		// 두 개의 문자열을 전달 받아 하나의 문자열로 합쳐서 리턴

	}
}
