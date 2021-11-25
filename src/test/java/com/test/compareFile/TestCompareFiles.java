package com.test.compareFile;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.compare.main.CompareFiles;

class ComparePropTest {
	Properties prop1;
	Properties prop2;
	CompareFiles compareFile;
	@BeforeEach
	void setup() {
		compareFile = new CompareFiles();
		prop1 = new Properties();
		prop2 = new Properties();
		prop1.put("App_id","APS");
		prop1.put("App_timeout","30000");
		prop1.put("App_connection_timeout","40000");
		prop2.put("Aap_id","APS");
		prop2.put("App_timeout","30000");
		prop2.put("App_connection_timeout","40000");
	}
	@Test
	void testCompareFile() {
		
		List<String> expected = new ArrayList<>();
		expected.add("Prop1 : Aap_id : missing");
		List<String> actual = compareFile.compareFiles(prop1,prop2);
		assertEquals(expected,actual);
	}

}
