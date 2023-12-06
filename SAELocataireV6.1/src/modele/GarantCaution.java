package modele;

// Class for Garant_Caution
public class GarantCaution {
	private static String id_Caution;
	private String nom;
	private String prenom;
	private String numero_Telephone;

	public GarantCaution(String id_Caution, String nom, String prenom, String numero_Telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.numero_Telephone = numero_Telephone;
	}

	public String getId_Caution() {
		return id_Caution;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumero_Telephone() {
		return numero_Telephone;
	}

	public void setNumero_Telephone(String numero_Telephone) {
		this.numero_Telephone = numero_Telephone;
	}
}
