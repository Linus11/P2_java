package com.hemebiotech;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class mySortedMap {

	
 
	//déclaer une map qui va contenir le jeu de clé valeur
    static Map<String, Integer> unsortMap = new HashMap<>();
		
 	public static void ordreAlphab() {
			
 		// décler une treemap qui va trier les valeurs
 		TreeMap<String, Integer> ordre = new TreeMap<>(unsortMap);
 		
 		
 		
 		for (Map.Entry<String, Integer> entry : ordre.entrySet()) {
			System.out.println("Clé = "+ entry.getKey()+ " Valeur = " + entry.getValue());
		}
			
		}
 	
 	public static void main(String[] args) {
 		
 	
 		
		 //creating unsorted map of employee id as a key and employee name as a value
       //Map unsortMap = new HashMap();
       unsortMap.put("Ashraf", 10);
       unsortMap.put("Sara", 5);
       unsortMap.put("Mohamed", 6);
       unsortMap.put("Esraa", 20);
       unsortMap.put("Bahaa", 1);
       unsortMap.put("Dalia", 7);
       unsortMap.put("Amira", 8);
       unsortMap.put("Ahmed", 99);
       unsortMap.put("Sama", 50);
       unsortMap.put("Nada", 2);
       unsortMap.put("Osama", 9);
       
       ordreAlphab();
			
				
	}
 	
}
        
      
 
    
        
        

