package modele;

import java.util.Date;
import java.util.Objects;

public class Taxe {
	private final int idTaxeFonciere;
	private double baseImposition;
	private double typeTaxe;
	private double taux;
	private Date dateTaxe;
	private BienImmobilier bienImmobilier;

	public Taxe(int idTaxeFonciere, double baseImposition, double typeTaxe,
			double taux, Date dateTaxe, BienImmobilier bienImmobilier) {
		this.idTaxeFonciere = idTaxeFonciere;
		this.baseImposition = baseImposition;
		this.typeTaxe = typeTaxe;
		this.taux = taux;
		this.dateTaxe = dateTaxe;
		this.bienImmobilier = bienImmobilier;
	}

	public int getIdTaxeFonciere() {
		return idTaxeFonciere;
	}

	public double getBaseImposition() {
		return baseImposition;
	}

	public double getTypeTaxe() {
		return typeTaxe;
	}

	public double getTaux() {
		return taux;
	}

	public Date getDateTaxe() {
		return dateTaxe;
	}

	public BienImmobilier getBienImmobilier() {
		return bienImmobilier;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idTaxeFonciere);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Taxe)) {
			return false;
		}
		Taxe other = (Taxe) obj;
		return Objects.equals(idTaxeFonciere, other.idTaxeFonciere);
	}



	/**
	 * @param baseImposition the baseImposition to set
	 */
	public void setBaseImposition(double baseImposition) {
		this.baseImposition = baseImposition;
	}

	/**
	 * @param typeTaxe the typeTaxe to set
	 */
	public void setTypeTaxe(double typeTaxe) {
		this.typeTaxe = typeTaxe;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**
	 * @param dateTaxe the dateTaxe to set
	 */
	public void setDateTaxe(Date dateTaxe) {
		this.dateTaxe = dateTaxe;
	}

	/**
	 * @param bienImmobilier the bienImmobilier to set
	 */
	public void setBienImmobilier(BienImmobilier bienImmobilier) {
		this.bienImmobilier = bienImmobilier;
	}
}
