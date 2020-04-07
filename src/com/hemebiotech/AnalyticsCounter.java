package com.hemebiotech;
import org.json.simple.JSONObject;


import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		
		
		controller.executer();
		
		
		
		
		/**
		 * Eviter les problèmes d'encodage :
		 * Serialisation dans un fichier Json, via utilisation d'une bibliothèque
		 * l'objet obj prend en paramettre la liste ds symptomes triées et l'enregistre dans un fichier "results.json"
		 * 
		 */
//		JSONObject obj = new JSONObject(symptome);
//		System.out.println(obj);
//		
//		 try (FileWriter file = new FileWriter("results.json")) {
//			 
//	            file.write(obj.toJSONString());
//	            file.flush();
//	 
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
		
		
	}
}
