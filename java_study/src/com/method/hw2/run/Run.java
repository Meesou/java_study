package com.method.hw2.run;

import com.method.hw2.controller.NonStaticSample1;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticSample1 n = new NonStaticSample1();
		
		System.out.print("크기가 5인 랜덤값 : " + n.intArrayAllocation(5));
		// 왜 주소값만 찍히는가...
		
		
	}

}
