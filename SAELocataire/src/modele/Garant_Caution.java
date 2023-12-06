package modele;

import java.util.Objects;

public class Garant_Caution {
	private final int idCaution;
	private String nom;
	private String prenom;
	private String numeroTelephone;

	public Garant_Caution(int idCaution, String nom, String prenom, String numeroTelephone) {
		this.idCaution = idCaution;
		this.nom = nom;
		this.prenom = prenom;
		this.numeroTelephone = numeroTelephone;
	}

	public int getIdCaution() {
		return idCaution;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCaution);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Garant_Caution)) {
			return false;
		}
		Garant_Caution other = (Garant_Caution) obj;
		return Objects.equals(idCaution, other.idCaution);
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
	 * @param numeroTelephone the numeroTelephone to set
	 */
	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}
}
