package modele;

import java.util.Objects;

public class Batiment {
	private final int idBatiment;
	private  String regimeJuridique;
	private  String adresse;
	private  String dateConstruction;
	private  String equipementTechnologies;
	private  String enumerationPartCommunes;

	public Batiment(int idBatiment, String regimeJuridique, String adresse,
			String dateConstruction, String equipementTechnologies, String enumerationPartCommunes) {
		this.idBatiment = idBatiment;
		this.regimeJuridique = regimeJuridique;
		this.adresse = adresse;
		this.dateConstruction = dateConstruction;
		this.equipementTechnologies = equipementTechnologies;
		this.enumerationPartCommunes = enumerationPartCommunes;
	}

	public int getIdBatiment() {
		return idBatiment;
	}

	public String getRegimeJuridique() {
		return regimeJuridique;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getDateConstruction() {
		return dateConstruction;
	}

	public String getEquipementTechnologies() {
		return equipementTechnologies;
	}

	public String getEnumerationPartCommunes() {
		return enumerationPartCommunes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idBatiment);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Batiment)) {
			return false;
		}
		Batiment other = (Batiment) obj;
		return Objects.equals(idBatiment, other.idBatiment);
	}


	/**
	 * @param regimeJuridique the regimeJuridique to set
	 */
	public void setRegimeJuridique(String regimeJuridique) {
		this.regimeJuridique = regimeJuridique;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @param dateConstruction the dateConstruction to set
	 */
	public void setDateConstruction(String dateConstruction) {
		this.dateConstruction = dateConstruction;
	}

	/**
	 * @param equipementTechnologies the equipementTechnologies to set
	 */
	public void setEquipementTechnologies(String equipementTechnologies) {
		this.equipementTechnologies = equipementTechnologies;
	}

	/**
	 * @param enumerationPartCommunes the enumerationPartCommunes to set
	 */
	public void setEnumerationPartCommunes(String enumerationPartCommunes) {
		this.enumerationPartCommunes = enumerationPartCommunes;
	}
}
