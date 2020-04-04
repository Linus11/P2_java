package com.hemebiotech;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class WriteSymptomDataFromFile {

	
	public void transfert(Map<String, Integer> map) throws IOException{

		/**
		 * Prend le fichier outOccurences et le transferer dans un fichier result.out
		 * 	
		 * @return write liste des symthomes + occurences
		 * 
		 */

		
		Map<String, Integer>write = new HashMap();
		String writeString;
		
		

		FileOutputStream fos = new FileOutputStream(config.outputLink); //result.out
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(map);
			
//			//var source = Paths.get(config.outOccurences);
//	        Path dest = Paths.get(config.outputLink); // result.out
//	        
//	        //var fis = Files.newInputStream(source);
//	       OutputStream fos = Files.newOutputStream(dest);
//	        
//	        byte[] buffer = new byte[1024];
//	        int length;
//	        
//	        while ((length = fos.write(Map<String, Integer>;)) > 0) { // write => clé , valeur  // boucle valeur
//	        	fos.write(buffer, 0, length);
//	        	
//	        }
			//return write;

	            
	        }
}
