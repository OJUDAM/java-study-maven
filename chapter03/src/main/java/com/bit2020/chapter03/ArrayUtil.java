package com.bit2020.chapter03;

public class ArrayUtil {
	public static double[] intToDouble(int[] source) {
		return null;
	}

	public static int[] doubleToInt(double[] source) {
		return null;
	}

	public static int[] concat(int[] a, int[] b) {
		int[] result = null;
		
		result = new int[a.length+b.length];
		int index = 0;
		for(int i=0;i<a.length;i++) {
			result[index++] = a[i];
		}
		for(int i=0;i<b.length;i++) {
			result[index++] = b[i];
		}
		
		return result;
	}

	
}
