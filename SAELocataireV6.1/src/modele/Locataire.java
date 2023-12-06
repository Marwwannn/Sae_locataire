package modele;

// Class for Locataire
public class Locataire {
	private static String id_Locataire;
	private String nom;
	private String prenom;
	private String telephone;
	private String mail;
	private String adresse;
	private int code_Postal;

	public Locataire(String id_Locataire, String nom, String prenom, String telephone, String mail, String adresse, int code_Postal) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.mail = mail;
		this.adresse = adresse;
		this.code_Postal = code_Postal;
	}

	public String getIdLocataire() {
		return id_Locataire;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCode_Postal() {
		return code_Postal;
	}

	public void setCode_Postal(int code_Postal) {
		this.code_Postal = code_Postal;
	}
}