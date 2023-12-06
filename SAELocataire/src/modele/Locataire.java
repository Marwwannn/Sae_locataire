package modele;

import java.util.Objects;

public class Locataire {
	private final int idLocataire;
	private String nom;
	private String prenom;
	private String telephone;
	private String mail;
	private String adresse;
	private String codePostal;

	public Locataire(int idLocataire, String nom, String prenom, String telephone,
			String mail, String adresse, String codePostal) {
		this.idLocataire = idLocataire;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.mail = mail;
		this.adresse = adresse;
		this.codePostal = codePostal;
	}

	public int getIdLocataire() {
		return idLocataire;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getMail() {
		return mail;
	}

	public String getAdresse() {
		return adresse;
	}

	public byte getCodePostal() {
		return codePostal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idLocataire);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Locataire)) {
			return false;
		}
		Locataire other = (Locataire) obj;
		return Objects.equals(idLocataire, other.idLocataire);
	}



	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(byte codePostal) {
		this.codePostal = codePostal;
	}
}