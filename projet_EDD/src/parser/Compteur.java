package parser;

/**
 * 1ere implementation de l'interface ContentHandler
 * @author eljaafari ilyas
 *
 */

public class Compteur implements ContentHandler{
	/**
	 * ce paramttre qui va nous aider a compter
	 */
	private int compteur;
	private int compteurCmt;
	
	 public Compteur() {
		compteur=0;
		compteurCmt=0;
	}
	 /**
	  * redifintion de la fonction defaultline 
	  */
	 
	@Override
	public void defaultLine(String content) {
		// TODO Auto-generated method stub
		compteur++;
		
	}
	 /**
	  * redifintion de la fonction getcompteur 
	  */
	@Override
	public int getCompteur() {
		// TODO Auto-generated method stub
		return compteur;
	}
	public int getCompteurCmt() {
		// TODO Auto-generated method stub
		return compteurCmt;
	}
	@Override
	public void commentLine(String comment) {
		// TODO Auto-generated method stub
		compteurCmt++;
	}

}
