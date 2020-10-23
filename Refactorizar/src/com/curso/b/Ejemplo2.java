package com.curso.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ejemplo2 {

	protected void appendMapEntries(Map<String, List<String>> map, String key, List<String> values) {
		for (String value : values) {
			List<String> existingValues = map.get(key);
			if (existingValues == null) {
				existingValues = new ArrayList<String>();
				map.put(key, existingValues);
			} else {
				existingValues.add(value);
			}
		}
	}
}
