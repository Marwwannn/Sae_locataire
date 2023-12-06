package modele;

import java.util.Currency;
import java.util.Date;
import java.util.Objects;

public class Echeance {
	private final String numeroPolice;
	private Date dateEcheance;
	private Currency montant;
	private Assurance assurance;

	public Echeance(String numeroPolice, Date dateEcheance, Currency montant, Assurance assurance) {
		this.numeroPolice = numeroPolice;
		this.dateEcheance = dateEcheance;
		this.montant = montant;
		this.assurance = assurance;
	}

	public String getNumeroPolice() {
		return numeroPolice;
	}

	public Date getDateEcheance() {
		return dateEcheance;
	}

	public Currency getMontant() {
		return montant;
	}

	public Assurance getAssurance() {
		return assurance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroPolice, dateEcheance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Echeance)) {
			return false;
		}
		Echeance other = (Echeance) obj;
		return Objects.equals(numeroPolice, other.numeroPolice) &&
				Objects.equals(dateEcheance, other.dateEcheance);
	}



	/**
	 * @param dateEcheance the dateEcheance to set
	 */
	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Currency montant) {
		this.montant = montant;
	}

	/**
	 * @param assurance the assurance to set
	 */
	public void setAssurance(Assurance assurance) {
		this.assurance = assurance;
	}
}
