package parser;

public interface ContentHandler {
	/**
	 * cette fonction perment returner la valeur d'un compteur
	 * @return entier : c'est le nombre de ligne trouve dans le fichier
	 */
	
	int defaultLine(String content);
	
}
