package com.method.hw1.run;

import com.method.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
	
		NonStaticSample n = new NonStaticSample();
	
		n.printLottoNumbers();
		System.out.println(n.alphabette()); 
		System.out.println(n.mySubstring("apple", 2, 4));
		n.outputChar(5, 'a'); 
	
		
	}
}
