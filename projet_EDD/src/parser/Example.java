package parser;

import java.io.File;

public class Example {
		
	
	public static void main(String[] args) {
			FileParser FileP=new FileParser();
			ContentHandler compteur = new Compteur();		
			File file = new File("C:/installLog.txt");
			FileP.parse(file,compteur);
		
		}	
}



