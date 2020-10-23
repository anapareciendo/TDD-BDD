package com.curso.a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo1 {

	private static List<String> readListStringsFromCSVFile(String filePath) throws IOException {
		  List<String> fileEntries = new ArrayList<>();
		  BufferedReader br = new BufferedReader(new FileReader(filePath));
		  String line;
		  while ((line = br.readLine()) != null) { 
		    fileEntries.add(line);
		  }
		  return fileEntries;
		}
}
