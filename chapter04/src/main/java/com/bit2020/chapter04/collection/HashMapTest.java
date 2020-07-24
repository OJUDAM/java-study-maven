package com.bit2020.chapter04.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("one", 1); /// auto boxing
		map.put("two", 2);
		map.put("three", 3);
		
		int i = map.get(new String("two"));
		//auto unboxing
		int j = map.get("one");
		System.out.println(i+":"+j);
	
		map.put("three", 33333333);
		System.out.println(map.get("three"));
		
		Set<String> s = map.keySet();
		
		for(String key : s) {
			System.out.println(key+" | " +map.get(key));
		}
	}

}
