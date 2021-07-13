package com.kh.api;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {

	
	public DateCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public long leapDate() {
		
		/*
		1년 1월 1일부터 오늘까지의 총 날 수를 계산
		1년부터 현재 연도까지 각 연 도가 윤년이면 총 날수에 366 일을,
		 
		평년이면 365일을 더함 해당 현재 연도가 윤년이면 2 월을 29일로 평년이면 28일로 더함
		월의 날짜 수를 더함
		(31일: 1, 3, 5, 7, 8, 10, 12월/ 30일: 4, 6, 9, 11월)
		*/
		
		long result = 0; // 값을 담고 리턴할 변수 선언
		
		Calendar cal = Calendar.getInstance(); //현재날짜 
		
		int todayYear = cal.get(GregorianCalendar.YEAR);
		int todayMonth = cal.get(GregorianCalendar.MONTH)+1;
		int todayDay = cal.get(GregorianCalendar.DATE); 
	
		// 1년 ~작년 (2020) 까지 
		for (int i = 1; i <= todayYear; i++) {
			if (i == todayYear) {
				isLeapYear(i);
				result += 366;// 만약 윤년일떄
			} else {
				isLeapYear(i); // 평년일때
				result +=365;
			}
			

			for (int j = 1; j <= todayMonth; j++) {
				if (j == 4 || j == 6 || j == 9 || j == 11) { // 각달의 30일일때
					result += 30;
				} else {
					result += 31;
					if (j == 2) { // 2월일때
						result += 29;
					} else {
						result += 28;
					}

				}

			}
			for (int k = 0; k <= todayDay; k++) {

				result += k;
			}

		}

		return result;

		//조건을 나눠서 3개 
	}
	
	
	public boolean isLeapYear (int year) {
		/*연도가 윤년이면 true, 평년이 면 false 리턴
	(윤년: 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수가 되는 해)
    */
		if((year % 4 == 0 && year % 100 !=0 ) || year%400 == 0) {
		///	System.out.println("올해는 윤년입니다");
			return true;
		}else {
		///	System.out.println("올해는 평년 입니다");
			return false;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		//showdate 
		// Calendar클래스를 이용한다.
		// 평년인지 윤년인지 isLeapYear()를 통해서 출력한다.
		// 평년과 윤년을 고려해 leapDate()로 총 날짜 수를 출력한다.
		
		
		DateCalculator totalDay = new DateCalculator();
		System.out.println(totalDay.leapDate());
		System.out.println("총 날짜 수 : " + totalDay.leapDate());
	
		
	}
}
