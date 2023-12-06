package modele;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Charges {
	private  Bien_Immobilier bienImmobilier;
	private  int idCharges;
	private  BigDecimal montant;
	private  Date dateCharge;
	private  String typeCharge;
	private  String pourcentagePartEntretien;

	public Charges(Bien_Immobilier bienImmobilier, int idCharges, BigDecimal montant,
			Date dateCharge, String typeCharge, String pourcentagePartEntretien) {
		this.bienImmobilier = bienImmobilier;
		this.idCharges = idCharges;
		this.montant = montant;
		this.dateCharge = dateCharge;
		this.typeCharge = typeCharge;
		this.pourcentagePartEntretien = pourcentagePartEntretien;
	}

	public Bien_Immobilier getBienImmobilier() {
		return bienImmobilier;
	}

	public int getIdCharges() {
		return idCharges;
	}

	public BigDecimal getMontant() {
		return montant;
	}

	public Date getDateCharge() {
		return dateCharge;
	}

	public String getTypeCharge() {
		return typeCharge;
	}

	public String getPourcentagePartEntretien() {
		return pourcentagePartEntretien;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bienImmobilier, idCharges);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Charges)) {
			return false;
		}
		Charges other = (Charges) obj;
		return Objects.equals(bienImmobilier, other.bienImmobilier) &&
				Objects.equals(idCharges, other.idCharges);
	}

	/**
	 * @param bienImmobilier the bienImmobilier to set
	 */
	public void setBienImmobilier(Bien_Immobilier bienImmobilier) {
		this.bienImmobilier = bienImmobilier;
	}

	/**
	 * @param idCharges the idCharges to set
	 */
	public void setIdCharges(int idCharges) {
		this.idCharges = idCharges;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}

	/**
	 * @param dateCharge the dateCharge to set
	 */
	public void setDateCharge(Date dateCharge) {
		this.dateCharge = dateCharge;
	}

	/**
	 * @param typeCharge the typeCharge to set
	 */
	public void setTypeCharge(String typeCharge) {
		this.typeCharge = typeCharge;
	}

	/**
	 * @param pourcentagePartEntretien the pourcentagePartEntretien to set
	 */
	public void setPourcentagePartEntretien(String pourcentagePartEntretien) {
		this.pourcentagePartEntretien = pourcentagePartEntretien;
	}
}
