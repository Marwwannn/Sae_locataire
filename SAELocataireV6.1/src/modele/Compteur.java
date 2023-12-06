package modele;

import java.util.Objects;

public class Compteur {
	private  String idCompteur;
	private  String dateReleve;
	private  String typeCompteur;
	private  int valeur;
	private  BienImmobilier bienImmobilier;

	public Compteur(String idCompteur, String dateReleve, String typeCompteur, int valeur, BienImmobilier bienImmobilier) {
		this.idCompteur = idCompteur;
		this.dateReleve = dateReleve;
		this.typeCompteur = typeCompteur;
		this.valeur = valeur;
		this.bienImmobilier = bienImmobilier;
	}

	public String getIdCompteur() {
		return idCompteur;
	}

	public String getDateReleve() {
		return dateReleve;
	}

	public String getTypeCompteur() {
		return typeCompteur;
	}

	public int getValeur() {
		return valeur;
	}

	public BienImmobilier getBienImmobilier() {
		return bienImmobilier;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCompteur, dateReleve);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Compteur)) {
			return false;
		}
		Compteur other = (Compteur) obj;
		return Objects.equals(idCompteur, other.idCompteur) &&
				Objects.equals(dateReleve, other.dateReleve);
	}

	/**
	 * @param idCompteur the idCompteur to set
	 */
	public void setIdCompteur(String idCompteur) {
		this.idCompteur = idCompteur;
	}

	/**
	 * @param dateReleve the dateReleve to set
	 */
	public void setDateReleve(String dateReleve) {
		this.dateReleve = dateReleve;
	}

	/**
	 * @param typeCompteur the typeCompteur to set
	 */
	public void setTypeCompteur(String typeCompteur) {
		this.typeCompteur = typeCompteur;
	}

	/**
	 * @param valeur the valeur to set
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	/**
	 * @param bienImmobilier the bienImmobilier to set
	 */
	public void setBienImmobilier(BienImmobilier bienImmobilier) {
		this.bienImmobilier = bienImmobilier;
	}
}
