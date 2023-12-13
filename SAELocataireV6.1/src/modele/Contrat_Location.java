package modele;

import java.util.Currency;
import java.util.Date;
import java.util.Objects;

public class Contrat_Location {
	private  Date dateDebutContrat;
	private  Currency montant;
	private  String montantDernierLoyer;
	private  Date dateVersementLoyer;
	private  String depotDeGarantie;
	private  String dateRevision;
	private  String periodicitePaiement;
	private  Date dateFinContrat;
	private  Currency chargesProvisionnelles;
	private final String idICC;
	private  String valeurICC;
	private  Bien_Immobilier bienImmobilier;

	public Contrat_Location(Date dateDebutContrat, Currency montant, String montantDernierLoyer,
			Date dateVersementLoyer, String depotDeGarantie, String dateRevision,
			String periodicitePaiement, Date dateFinContrat, Currency chargesProvisionnelles,
			String idICC, String valeurICC, Bien_Immobilier bienImmobilier) {
		this.dateDebutContrat = dateDebutContrat;
		this.montant = montant;
		this.montantDernierLoyer = montantDernierLoyer;
		this.dateVersementLoyer = dateVersementLoyer;
		this.depotDeGarantie = depotDeGarantie;
		this.dateRevision = dateRevision;
		this.periodicitePaiement = periodicitePaiement;
		this.dateFinContrat = dateFinContrat;
		this.chargesProvisionnelles = chargesProvisionnelles;
		this.idICC = idICC;
		this.valeurICC = valeurICC;
		this.bienImmobilier = bienImmobilier;
	}

	public Date getDateDebutContrat() {
		return dateDebutContrat;
	}

	public Currency getMontant() {
		return montant;
	}

	public String getMontantDernierLoyer() {
		return montantDernierLoyer;
	}

	public Date getDateVersementLoyer() {
		return dateVersementLoyer;
	}

	public String getDepotDeGarantie() {
		return depotDeGarantie;
	}

	public String getDateRevision() {
		return dateRevision;
	}

	public String getPeriodicitePaiement() {
		return periodicitePaiement;
	}

	public Date getDateFinContrat() {
		return dateFinContrat;
	}

	public Currency getChargesProvisionnelles() {
		return chargesProvisionnelles;
	}

	public String getIdICC() {
		return idICC;
	}

	public String getValeurICC() {
		return valeurICC;
	}

	public Bien_Immobilier getBienImmobilier() {
		return bienImmobilier;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateDebutContrat);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Contrat_Location)) {
			return false;
		}
		Contrat_Location other = (Contrat_Location) obj;
		return Objects.equals(dateDebutContrat, other.dateDebutContrat);
	}

	/**
	 * @param dateDebutContrat the dateDebutContrat to set
	 */
	public void setDateDebutContrat(Date dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Currency montant) {
		this.montant = montant;
	}

	/**
	 * @param montantDernierLoyer the montantDernierLoyer to set
	 */
	public void setMontantDernierLoyer(String montantDernierLoyer) {
		this.montantDernierLoyer = montantDernierLoyer;
	}

	/**
	 * @param dateVersementLoyer the dateVersementLoyer to set
	 */
	public void setDateVersementLoyer(Date dateVersementLoyer) {
		this.dateVersementLoyer = dateVersementLoyer;
	}

	/**
	 * @param depotDeGarantie the depotDeGarantie to set
	 */
	public void setDepotDeGarantie(String depotDeGarantie) {
		this.depotDeGarantie = depotDeGarantie;
	}

	/**
	 * @param dateRevision the dateRevision to set
	 */
	public void setDateRevision(String dateRevision) {
		this.dateRevision = dateRevision;
	}

	/**
	 * @param periodicitePaiement the periodicitePaiement to set
	 */
	public void setPeriodicitePaiement(String periodicitePaiement) {
		this.periodicitePaiement = periodicitePaiement;
	}

	/**
	 * @param dateFinContrat the dateFinContrat to set
	 */
	public void setDateFinContrat(Date dateFinContrat) {
		this.dateFinContrat = dateFinContrat;
	}

	/**
	 * @param chargesProvisionnelles the chargesProvisionnelles to set
	 */
	public void setChargesProvisionnelles(Currency chargesProvisionnelles) {
		this.chargesProvisionnelles = chargesProvisionnelles;
	}


	/**
	 * @param valeurICC the valeurICC to set
	 */
	public void setValeurICC(String valeurICC) {
		this.valeurICC = valeurICC;
	}

	/**
	 * @param bienImmobilier the bienImmobilier to set
	 */
	public void setBienImmobilier(Bien_Immobilier bienImmobilier) {
		this.bienImmobilier = bienImmobilier;
	}
}
