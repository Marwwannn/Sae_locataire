package modele;

import java.util.Date;
import java.util.Objects;

public class Contenir {
	private final int idCaution;
	private  String dateDebutContrat;
	private  GarantCaution garantCaution;
	private  ContratLocation contratLocation;

	public Contenir(int idCaution, String dateDebutContrat, GarantCaution garantCaution, ContratLocation contratLocation) {
		this.idCaution = idCaution;
		this.dateDebutContrat = dateDebutContrat;
		this.garantCaution = garantCaution;
		this.contratLocation = contratLocation;
	}

	public int getIdCaution() {
		return idCaution;
	}

	public String getDateDebutContrat() {
		return dateDebutContrat;
	}

	public GarantCaution getGarantCaution() {
		return garantCaution;
	}

	public ContratLocation getContratLocation() {
		return contratLocation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCaution, dateDebutContrat);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Contenir)) {
			return false;
		}
		Contenir other = (Contenir) obj;
		return idCaution == other.idCaution &&
				Objects.equals(dateDebutContrat, other.dateDebutContrat);
	}



	/**
	 * @param dateDebutContrat the dateDebutContrat to set
	 */
	public void setDateDebutContrat(String dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}

	/**
	 * @param garantCaution the garantCaution to set
	 */
	public void setGarantCaution(GarantCaution garantCaution) {
		this.garantCaution = garantCaution;
	}

	/**
	 * @param contratLocation the contratLocation to set
	 */
	public void setContratLocation(ContratLocation contratLocation) {
		this.contratLocation = contratLocation;
	}
}
