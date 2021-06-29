package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {
	
	public static void main(String[] args) {
		
		
		Product pd = new Product("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
		Product pd1 = new Product("lgxnote5","LG스마트폰5","경기도 평택",780000,0.7);
		Product pd2 = new Product("ktsnote3","KT스마트폰3","서울시 강남",250000,0.3);
		
		//new 연산자를 통해 객체 생성 
	
		System.out.println(pd.toString());
		System.out.println(pd1.toString());
		System.out.println(pd2.toString());
		
		//필드값 확인 
		
		// 각 객체의 가격을 모두 120만원으로 변경 
		// 부가세율도 모두 0.05로 변경 // 객체가 가진 필드 값 출력 확인

		pd.setPrice(12000000);
		pd1.setPrice(12000000);
		pd2.setPrice(12000000);
		
		pd.setTax(0.05);
		pd1.setTax(0.05);
		pd2.setTax(0.05);
		
		System.out.println(pd.toString());
		System.out.println(pd1.toString());
		System.out.println(pd2.toString());
		
		// 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
		// 실제가격 = 가격 +(가격 * 부가세율)
		
		double rp = pd.getPrice() + (pd.getPrice() * pd.getTax());
		double rp1 = pd1.getPrice() + (pd1.getPrice() * pd1.getTax());
		double rp2 = pd2.getPrice() + (pd2.getPrice() * pd2.getTax());

		System.out.println("상품명 : "  +pd.getProductName());
		System.out.println("부가세포함가격 : " + (int)rp); //소수점 나오니까 강제형변환 시켜줌 
		

		System.out.println("상품명 : "  +pd1.getProductName());
		System.out.println("부가세포함가격 : " + (int)rp1);
		

		System.out.println("상품명 : "  +pd2.getProductName());
		System.out.println("부가세포함가격 : " + (int)rp2);
		
		
	}
	
	
	
	
}
