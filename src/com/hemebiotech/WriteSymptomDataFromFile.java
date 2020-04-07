package com.hemebiotech;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class WriteSymptomDataFromFile {
	
	
	
	

	public WriteSymptomDataFromFile(TreeMap<String, Integer> countTreeMap) {
		// TODO Auto-generated constructor stub
	}

	public void transfert(Map<String, Integer> map) throws IOException{

		/**
		 * 
		 * Cette méthode prend en paramettre un Hashmap, la TreeMap permet de trier le fichier via un jeu de clé / valeur
		 * 
		 * puis le stocke dans un fichier de sortie, en l'ocurrence results.out
		 * 
		 */
			
		TreeMap<String, Integer> ordre = new TreeMap<>(map);
 		
 		System.out.println("==== List of symptoms ordred =====");
 		for (Map.Entry<String, Integer> entry : ordre.entrySet()) {
 			
			System.out.println(entry.getKey()+ "  " + entry.getValue());
		}
 		
 		

		FileOutputStream fos = new FileOutputStream(config.outputLink); //result.out
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(map); //tree map forcheach sur chaque assotiation clé valeur 
		
		//chercher les clés de la tri map et faire une foreach sur le set et écrire dans une boucle foreach
		
		//rappelle du contexte
		// objectifs
		//déroulement de la présentation (début) coment ça va se passer
		
		//demo du programme
		//ou sont les problèmes
		//état des lieux
		//class main en cap d'écran // ce qui n'allait pas
			

	            
	        }

	public void write() {
		// TODO Auto-generated method stub
		
	}
}
