package org.practice03.prob4;

public class StringUtil {
	public static String concatenate(String[] str) {
		StringBuilder sumString = new StringBuilder();
		for(String s : str) {
			sumString.append(s);
		}
		return sumString.toString();
	}
}
