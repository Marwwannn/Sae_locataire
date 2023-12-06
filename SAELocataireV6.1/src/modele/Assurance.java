package modele;

import java.util.Date;
import java.util.Objects;

public class Assurance {
	private final String numeroPolice;
	private  String tarifInitial;
	private  String typeAssurance;
	private  Date dateEffetDebut;
	private  BienImmobilier bienImmobilier;
	private  Batiment batiment;

	public Assurance(String numeroPolice, String tarifInitial, String typeAssurance,
			Date dateEffetDebut, BienImmobilier bienImmobilier, Batiment batiment) {
		this.numeroPolice = numeroPolice;
		this.tarifInitial = tarifInitial;
		this.typeAssurance = typeAssurance;
		this.dateEffetDebut = dateEffetDebut;
		this.bienImmobilier = bienImmobilier;
		this.batiment = batiment;
	}

	public String getNumeroPolice() {
		return numeroPolice;
	}

	public String getTarifInitial() {
		return tarifInitial;
	}

	public String getTypeAssurance() {
		return typeAssurance;
	}

	public Date getDateEffetDebut() {
		return dateEffetDebut;
	}

	public BienImmobilier getBienImmobilier() {
		return bienImmobilier;
	}

	public Batiment getBatiment() {
		return batiment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroPolice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Assurance)) {
			return false;
		}
		Assurance other = (Assurance) obj;
		return Objects.equals(numeroPolice, other.numeroPolice);
	}


	/**
	 * @param tarifInitial the tarifInitial to set
	 */
	public void setTarifInitial(String tarifInitial) {
		this.tarifInitial = tarifInitial;
	}

	/**
	 * @param typeAssurance the typeAssurance to set
	 */
	public void setTypeAssurance(String typeAssurance) {
		this.typeAssurance = typeAssurance;
	}

	/**
	 * @param dateEffetDebut the dateEffetDebut to set
	 */
	public void setDateEffetDebut(Date dateEffetDebut) {
		this.dateEffetDebut = dateEffetDebut;
	}

	/**
	 * @param bienImmobilier the bienImmobilier to set
	 */
	public void setBienImmobilier(BienImmobilier bienImmobilier) {
		this.bienImmobilier = bienImmobilier;
	}

	/**
	 * @param batiment the batiment to set
	 */
	public void setBatiment(Batiment batiment) {
		this.batiment = batiment;
	}


}
