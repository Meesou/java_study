package com.IO.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.IO.model.vo.Book;

public class BookManager {
	
	private Scanner sc = new Scanner(System.in);

	
	public BookManager() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void fileSave() {
		Book[] bk = new Book[5];
		// Book객체를 받을 객체 배열 // 객체 배열을 3번의 사용데이터로 초기화
		// (출판날짜는 아래 setCalendar 메소드를 활용)
		
		 bk[0] = new Book("C언어", "김씨", 10000, setCalendar(2012,2,2),0.1);
		 bk[1] = new Book("자바", "이씨", 20000, setCalendar(2013,3,3),0.2);
		 bk[2] = new Book("C++", "박씨", 30000, setCalendar(2014,4,4),0.3);
		 bk[3] = new Book("넛지", "서씨", 40000, setCalendar(2015,5,5),0.4);
		 bk[4] = new Book("개미", "최씨", 50000, setCalendar(2016,6,6),0.5);
		
	
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
		//	f1.createNewFile();
			

			for (int i = 0; i < bk.length; i++) {
				// oos.write(bk[i]); 얘는 아님 객체파일을 넣어줘ㅑ야되는데
				oos.writeObject(bk[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public Calendar setCalendar(int year, int month, int date) {
		
		//지정된 날짜의 Calendar형 반환 메소드
		 Calendar cal = Calendar.getInstance();
		 cal.set(year, month, date);
		 
		return cal;
	}
	
	public void fileRead() {

		Book[] rb = new Book[10];
		

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {

		
			for (int i = 0; i < rb.length; i++) {
				rb[i] = (Book) ois.readObject(); //얘는 왜 CastClassException이 나는지..
				System.out.println(rb[i]);
			}
			
		
		}catch(EOFException e) {
			System.out.println("파일읽기완");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		

	}
}
