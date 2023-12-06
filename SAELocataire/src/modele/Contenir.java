package modele;

import java.util.Date;
import java.util.Objects;

public class Contenir {
	private final int idCaution;
	private  Date dateDebutContrat;
	private  Garant_Caution garantCaution;
	private  Contrat_Location contratLocation;

	public Contenir(int idCaution, Date dateDebutContrat, Garant_Caution garantCaution, Contrat_Location contratLocation) {
		this.idCaution = idCaution;
		this.dateDebutContrat = dateDebutContrat;
		this.garantCaution = garantCaution;
		this.contratLocation = contratLocation;
	}

	public int getIdCaution() {
		return idCaution;
	}

	public Date getDateDebutContrat() {
		return dateDebutContrat;
	}

	public Garant_Caution getGarantCaution() {
		return garantCaution;
	}

	public Contrat_Location getContratLocation() {
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
	public void setDateDebutContrat(Date dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}

	/**
	 * @param garantCaution the garantCaution to set
	 */
	public void setGarantCaution(Garant_Caution garantCaution) {
		this.garantCaution = garantCaution;
	}

	/**
	 * @param contratLocation the contratLocation to set
	 */
	public void setContratLocation(Contrat_Location contratLocation) {
		this.contratLocation = contratLocation;
	}
}
