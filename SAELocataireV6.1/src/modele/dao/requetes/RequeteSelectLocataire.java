package modele.dao.requetes;

import modele.Locataire;
public class RequeteSelectLocataire extends Requete<Locataire> {

	public RequeteSelectLocataire() {
		// TODO Auto-generated constructor stub
	}
	public String requete() {
		return "select * from Creneau";
	}

}
