package com.hemebiotech;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnalyticsCounter {
	/*private static int headacheCount = 0;	// initialize to 0
	private static int rashCount = 0;		// initialize to 0
	private static int pupilCount = 0;		// initialize to 0
*/	
	
	public static void main(String args[]) throws Exception {
		
		
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile();
		
		Map<String, Integer> symptome = read.getSymptoms();
		
		WriteSymptomDataFromFile write = new WriteSymptomDataFromFile();
		write.transfert(symptome);
		
		
	}
}
