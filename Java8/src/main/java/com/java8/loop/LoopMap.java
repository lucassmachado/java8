package com.java8.loop;

import java.util.HashMap;
import java.util.Map;

public class LoopMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put(null, 40);
		map.put("E", null);
		map.put("F", 60);

		loopMap(map);
		loopMapCheckKeyNull(map);
	}

	private static void loopMapCheckKeyNull(Map<String, Integer> map) {
		map.forEach((key, value) -> {
			if (key != null) {
				System.out.println("Key: " + key + ", Value: " + value);
			}
		});
	}

	private static void loopMap(Map<String, Integer> map) {
		map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
	}

}
