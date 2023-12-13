package modele;

import java.util.Date;
import java.util.Objects;

public class Historique_Paiement {
	private final int idHistoriquePaiement;
	private String stocker;
	private Date dateDebutContrat;
	private Contrat_Location contratLocation;

	public Historique_Paiement(int idHistoriquePaiement, String stocker, Date dateDebutContrat, Contrat_Location contratLocation) {
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

	public Contrat_Location getContratLocation() {
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
		if (!(obj instanceof Historique_Paiement)) {
			return false;
		}
		Historique_Paiement other = (Historique_Paiement) obj;
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
	public void setContratLocation(Contrat_Location contratLocation) {
		this.contratLocation = contratLocation;
	}
}
