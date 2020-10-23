package com.curso.a;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Solucion1 {
	
	private static List<String> readListStringsFromCSVFile(String filePath) throws IOException {
		return Files.lines(Paths.get(filePath)).collect(Collectors.toList());
	}
}
