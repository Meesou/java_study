package com.hwhw2.run;

import com.hwhw2.model.vo.Circle;
import com.hwhw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
		// 위의 사용 데이터를 참고하여 각각 초기화
		
		Circle cl [] = new Circle[2]; 
		cl[0] = new Circle(1,2,3);
		cl[1] = new Circle(3,3,4);
		
		System.out.println("=========cl=========");
		// 각 도형의 draw 메소드 실행
		
		for(int i = 0; i < cl.length; i++) {
			cl[i].draw();
		}
		
		
		Rectangle rl[] = new Rectangle[2];
		rl[0] = new Rectangle(-1,-2,5,2);
		rl[1] = new Rectangle(-2, 5, 2, 8);
		

		System.out.println("=========rl=========");
		
		for(int i = 0; i < rl.length; i++) {
			rl[i].draw();
		}
		
		
	}

}
