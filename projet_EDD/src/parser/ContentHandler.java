package parser;

public interface ContentHandler {
	/**
	 * cette fonction perment returner la valeur d'un compteur
	 * @return entier : c'est le nombre de ligne trouve dans le fichier
	 */
	
	void defaultLine(String content);
	
	/**
	 * pour return la valeur du compteur 
	 */
	int getCompteur();
	public void commentLine(String comment);
	int getCompteurCmt();
}
