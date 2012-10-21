package parser;

import java.io.File;

public class Example {
		
	
	public static void main(String[] args) {
			FileParser FileP=new FileParser();
			ContentHandler compteur = new Compteur();		
			File file = new File("C:/installLog.txt");
			FileP.parse(file,compteur);
			System.out.println("Le fichier "+file.getName()+" contient "+
			compteur.getCompteur()+compteur.getCompteurCmt()+" ligne(s) dont "
					+ compteur.getCompteurCmt() + " commentaire"  );
		
		}	
}



