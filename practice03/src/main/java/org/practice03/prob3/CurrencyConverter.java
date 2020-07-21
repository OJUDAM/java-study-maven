package org.practice03.prob3;

public class CurrencyConverter {
	private static double rate;
	public static double changedMoney;
	
	public static double toDallar(double won) {
		
		changedMoney = won / rate;
		
		return changedMoney;
	}
	public static double toKRW(double dollar) {
		
		changedMoney =  dollar* rate;
		return changedMoney;
	}
	public static void setRate(double r) {
		rate = r;
	}
}
