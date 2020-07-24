package com.bit2020.chapter04;

import java.util.Calendar;

public class CalendarTest {
		
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		pritDate(cal);
		
		cal.set(Calendar.YEAR, 2021);
		pritDate(cal);
	}

	private static void pritDate(Calendar cal) {
		String[] days = {
				"일","월","화","수",
				"목","금","토"
		};

		int year = cal.get(Calendar.YEAR);
		
		int month = cal.get(Calendar.MONTH);
		
		int date = cal.get(Calendar.DATE);
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		int hour = cal.get(Calendar.HOUR);
		
		int minute = cal.get(Calendar.MINUTE);
		
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
				year +"년 "+
					(month+1)+"월 "+
					date+"일 "+
					"("+days[day-1]+")"+
					hour+" : "+
					minute+" : "+
					second);
		
	}
}
