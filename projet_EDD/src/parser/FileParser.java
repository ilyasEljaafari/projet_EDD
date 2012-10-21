package parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;



/**
 * la classe File Parser permet de parcourir les fichiers en entrée et réccupérer 
 * les lignes dont le contentHandler applique des traitements 
 * @author eljaafari
 * @version
 * @since
 */

public class FileParser {
	
	/**
	 *objet de l'interface ContentHandler 
	 */
	private ContentHandler contentHandler;
	
	/**
	 * Constructeur par défault 
	 */
	public FileParser() {
		
	}
	
	/**
	 * permet de lire toutes les lignes depuis un fichier 
	 * @param file
	 * @param contentHandler
	 */
	public static void parse(File file,ContentHandler contentHandler){

	
	try {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "" ;
		while( (line =br.readLine()) != null){
			contentHandler.defaultLine(line);
		}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Le fichier "+file.getName()+" contient "+
		contentHandler.getCompteur()+" ligne(s)");
	}


	
	
}
