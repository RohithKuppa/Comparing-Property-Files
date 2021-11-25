package com.compare.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class CompRunner {

	public static void main(String[] args) {

		Properties prop1 = new Properties();
		try {
			prop1.load(new FileReader("prop1.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Properties prop2 = new Properties();
		try {
			prop2.load(new FileReader("prop2.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		CompareFiles cmpFiles = new CompareFiles();
		List<String> fileProcessingResult = cmpFiles.compareFiles(prop1, prop2);
		for (String res : fileProcessingResult) {
			System.out.println(res);
		}
	}

}
