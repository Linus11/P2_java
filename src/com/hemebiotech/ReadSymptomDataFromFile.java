package com.hemebiotech;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.DuplicateFormatFlagsException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Implémentation dd la classe ReadSymptomDataFromFile
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	/**
	 * Récupérer le fichier de la liste des symptomes, le mettre dans une HashMap 'frequency' 
	 * 
	 */
	

	
	public  Map<String, Integer> getSymptoms(){
		/**
		 * Map<String, Integer> getSymptoms() retourn la liste des sympthomes et le nombre des occurences
		 * @return la liste des sympthomes et le nombre des occurences
		 */
		
		Map<String, Integer> frequency = new HashMap<>();
		
		/**
		 * Lever une exception si le transfert du data est mis en échec 
		 * 
		 */
		try {
			Path path = Paths.get(System.getProperty("user.dir"))
					.resolve(config.inputLink);
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(path.toFile()));
	
			/**
			 * déclarer un reader et l'affecter à un string 'line'
			 * 
			 */
		String line = reader.readLine();
		
		/**
		 * Si line n'est pas null boucler sur frequency 
		 * compter le nombre des occurence de 'line' dans la liste des sympthome frequency
		 * Si pas d'occurence ne pas incrémenter l'occurence '(line, 1)'
		 * 
		 */
		while(line != null) {
					
					if(frequency.containsKey(line)) {
						frequency.put(line, 
								frequency.get(line) + 1);
					} else {
						frequency.put(line, 1);
					}
			
			line = reader.readLine();
		}
		
		System.out.println("SIMO" + frequency);
		
		/**
		 * Instantier un objet file, 
		 * Indiquer le fichier de sortie dans l'attribut 'config.outOccurences'
		 * 
		 * @see config
		 * 
		 */
		 
		 FileOutputStream fileOut=new FileOutputStream(config.outOccurences);
	        ObjectOutputStream out=new ObjectOutputStream(fileOut);
	        

	        out.writeObject(frequency);
	        out.close();
	        
	        /**
			 * Afficher la liste finale des sympthomes avec leur occurences dans une MapList
			 *  
			 */
		 
		 for(Map.Entry<String, Integer> items : frequency.entrySet()) {
			 
			System.out.println(items.getKey() + " " + items.getValue());
			
		 }
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		return frequency;
		
	}

	
	
	
}
	
	