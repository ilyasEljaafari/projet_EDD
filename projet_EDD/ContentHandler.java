package parser;

public interface ContentHandler {
	/**
	 * cette fonction perment d'incrementer un compteur 
	 * @author eljaafari ilyas
	 * @return 
	 */
	
	void defaultLine(String content);
	/**
	 * cette fonction permet d'envoyer la valeur du compteur 
	 * @return la valeur du compteur
	 */
	int getCompteur();
}
