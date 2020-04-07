package com.hemebiotech;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class controller {

	
	static void executer() {
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile(null);
		
		Map<String, Integer> symptome = read.getSymptoms();
		Map<String, Integer> symp1 = read.getSymptoms();
		
		WriteSymptomDataFromFile write = new WriteSymptomDataFromFile(null);
		try {
			write.transfert(symptome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("== form trieSelf class test ==");
		
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("C:/Users/Elev/eclipse-workspace-java-se/P2_java/src/symptoms.txt");
		trieSelf countS = new trieSelf(reader.getSymptoms());
		TreeMap<String, Integer> countTreeMap = countS.countSymptom(symp1);
		WriteSymptomDataFromFile write1 = new WriteSymptomDataFromFile(countTreeMap);
		write1.write();
		
	}
	
}
