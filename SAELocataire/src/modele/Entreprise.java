package modele;

import java.util.Objects;

public class Entreprise {
	private final String siren;
	private String adresseEntreprise;
	private String numeroTelephone;
	private String adresseMail;

	public Entreprise(String siren, String adresseEntreprise, String numeroTelephone, String adresseMail) {
		this.siren = siren;
		this.adresseEntreprise = adresseEntreprise;
		this.numeroTelephone = numeroTelephone;
		this.adresseMail = adresseMail;
	}

	public String getSiren() {
		return siren;
	}

	public String getAdresseEntreprise() {
		return adresseEntreprise;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(siren);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Entreprise)) {
			return false;
		}
		Entreprise other = (Entreprise) obj;
		return Objects.equals(siren, other.siren);
	}


	/**
	 * @param adresseEntreprise the adresseEntreprise to set
	 */
	public void setAdresseEntreprise(String adresseEntreprise) {
		this.adresseEntreprise = adresseEntreprise;
	}

	/**
	 * @param numeroTelephone the numeroTelephone to set
	 */
	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	/**
	 * @param adresseMail the adresseMail to set
	 */
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
}
