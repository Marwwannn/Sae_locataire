package modele;

import java.util.Date;
import java.util.Objects;

public class Facture {
	private final String siren;
	private String idFacture;
	private double prix;
	private String typeEntretien;
	private Date dateFacture;
	private Bien_Immobilier bienImmobilier;
	private Batiment batiment;
	private Entreprise entreprise;

	public Facture(String siren, String idFacture, double prix, String typeEntretien,
			Date dateFacture, Bien_Immobilier bienImmobilier, Batiment batiment, Entreprise entreprise) {
		this.siren = siren;
		this.idFacture = idFacture;
		this.prix = prix;
		this.typeEntretien = typeEntretien;
		this.dateFacture = dateFacture;
		this.bienImmobilier = bienImmobilier;
		this.batiment = batiment;
		this.entreprise = entreprise;
	}

	public String getSiren() {
		return siren;
	}

	public String getIdFacture() {
		return idFacture;
	}

	public double getPrix() {
		return prix;
	}

	public String getTypeEntretien() {
		return typeEntretien;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public Bien_Immobilier getBienImmobilier() {
		return bienImmobilier;
	}

	public Batiment getBatiment() {
		return batiment;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	@Override
	public int hashCode() {
		return Objects.hash(siren, idFacture);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Facture)) {
			return false;
		}
		Facture other = (Facture) obj;
		return Objects.equals(siren, other.siren) &&
				Objects.equals(idFacture, other.idFacture);
	}


	/**
	 * @param idFacture the idFacture to set
	 */
	public void setIdFacture(String idFacture) {
		this.idFacture = idFacture;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @param typeEntretien the typeEntretien to set
	 */
	public void setTypeEntretien(String typeEntretien) {
		this.typeEntretien = typeEntretien;
	}

	/**
	 * @param dateFacture the dateFacture to set
	 */
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	/**
	 * @param bienImmobilier the bienImmobilier to set
	 */
	public void setBienImmobilier(Bien_Immobilier bienImmobilier) {
		this.bienImmobilier = bienImmobilier;
	}

	/**
	 * @param batiment the batiment to set
	 */
	public void setBatiment(Batiment batiment) {
		this.batiment = batiment;
	}

	/**
	 * @param entreprise the entreprise to set
	 */
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
}
