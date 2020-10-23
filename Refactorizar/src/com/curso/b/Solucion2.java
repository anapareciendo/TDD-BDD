package com.curso.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solucion2 {

	protected void appendMapEntries(Map<String, List<String>> map, String key, List<String> values) {
		values.forEach(value -> map.computeIfAbsent(key, k -> new ArrayList<>()).add(value));
	}
}
