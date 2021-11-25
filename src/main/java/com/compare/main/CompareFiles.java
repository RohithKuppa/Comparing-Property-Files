package com.compare.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CompareFiles {
	public List<String> compareFiles(Properties prop1, Properties prop2) {

		Map<String, String> fileMap = new HashMap<String, String>();
		List<String> result = new ArrayList<String>();
		for (String key : prop1.stringPropertyNames()) {
			String value = prop1.getProperty(key);
			fileMap.put(key, value);
		}
		for (String key : prop2.stringPropertyNames()) {
			if (!fileMap.containsKey(key)) {
				result.add("Prop1 : " + key + " : missing");
			}
		}
		return result;
	}

}
