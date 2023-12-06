package modele;

import java.util.Date;
import java.util.Objects;

public class Diagnostic {
	private final int referenceDiagnostic;
	private   String typeDiagnostic;
	private   String diagnostiqueur;
	private   Date dateVisite;
	private   Date dateValidite;
	private   String natureTravaux;
	private   String depensesReparations;
	private   Bien_Immobilier bienImmobilier;

	public Diagnostic(int referenceDiagnostic, String typeDiagnostic, String diagnostiqueur,
			Date dateVisite, Date dateValidite, String natureTravaux,
			String depensesReparations, Bien_Immobilier bienImmobilier) {
		this.referenceDiagnostic = referenceDiagnostic;
		this.typeDiagnostic = typeDiagnostic;
		this.diagnostiqueur = diagnostiqueur;
		this.dateVisite = dateVisite;
		this.dateValidite = dateValidite;
		this.natureTravaux = natureTravaux;
		this.depensesReparations = depensesReparations;
		this.bienImmobilier = bienImmobilier;
	}

	public int getReferenceDiagnostic() {
		return referenceDiagnostic;
	}

	public String getTypeDiagnostic() {
		return typeDiagnostic;
	}

	public String getDiagnostiqueur() {
		return diagnostiqueur;
	}

	public Date getDateVisite() {
		return dateVisite;
	}

	public Date getDateValidite() {
		return dateValidite;
	}

	public String getNatureTravaux() {
		return natureTravaux;
	}

	public String getDepensesReparations() {
		return depensesReparations;
	}

	public Bien_Immobilier getBienImmobilier() {
		return bienImmobilier;
	}

	@Override
	public int hashCode() {
		return Objects.hash(referenceDiagnostic);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Diagnostic)) {
			return false;
		}
		Diagnostic other = (Diagnostic) obj;
		return Objects.equals(referenceDiagnostic, other.referenceDiagnostic);
	}



	/**
	 * @param typeDiagnostic the typeDiagnostic to set
	 */
	public void setTypeDiagnostic(String typeDiagnostic) {
		this.typeDiagnostic = typeDiagnostic;
	}

	/**
	 * @param diagnostiqueur the diagnostiqueur to set
	 */
	public void setDiagnostiqueur(String diagnostiqueur) {
		this.diagnostiqueur = diagnostiqueur;
	}

	/**
	 * @param dateVisite the dateVisite to set
	 */
	public void setDateVisite(Date dateVisite) {
		this.dateVisite = dateVisite;
	}

	/**
	 * @param dateValidite the dateValidite to set
	 */
	public void setDateValidite(Date dateValidite) {
		this.dateValidite = dateValidite;
	}

	/**
	 * @param natureTravaux the natureTravaux to set
	 */
	public void setNatureTravaux(String natureTravaux) {
		this.natureTravaux = natureTravaux;
	}

	/**
	 * @param depensesReparations the depensesReparations to set
	 */
	public void setDepensesReparations(String depensesReparations) {
		this.depensesReparations = depensesReparations;
	}

	/**
	 * @param bienImmobilier the bienImmobilier to set
	 */
	public void setBienImmobilier(Bien_Immobilier bienImmobilier) {
		this.bienImmobilier = bienImmobilier;
	}
}
