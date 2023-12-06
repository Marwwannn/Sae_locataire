package modele;

import java.util.Date;
import java.util.Objects;

public class HistoriquePaiement {
	private final int idHistoriquePaiement;
	private String stocker;
	private Date dateDebutContrat;
	private ContratLocation contratLocation;

	public HistoriquePaiement(int idHistoriquePaiement, String stocker, Date dateDebutContrat, ContratLocation contratLocation) {
		this.idHistoriquePaiement = idHistoriquePaiement;
		this.stocker = stocker;
		this.dateDebutContrat = dateDebutContrat;
		this.contratLocation = contratLocation;
	}

	public int getIdHistoriquePaiement() {
		return idHistoriquePaiement;
	}

	public String getStocker() {
		return stocker;
	}

	public Date getDateDebutContrat() {
		return dateDebutContrat;
	}

	public ContratLocation getContratLocation() {
		return contratLocation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idHistoriquePaiement);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof HistoriquePaiement)) {
			return false;
		}
		HistoriquePaiement other = (HistoriquePaiement) obj;
		return idHistoriquePaiement == other.idHistoriquePaiement;
	}


	/**
	 * @param stocker the stocker to set
	 */
	public void setStocker(String stocker) {
		this.stocker = stocker;
	}

	/**
	 * @param dateDebutContrat the dateDebutContrat to set
	 */
	public void setDateDebutContrat(Date dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}

	/**
	 * @param contratLocation the contratLocation to set
	 */
	public void setContratLocation(ContratLocation contratLocation) {
		this.contratLocation = contratLocation;
	}
}
