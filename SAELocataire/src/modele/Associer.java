package modele;

import java.util.Date;
import java.util.Objects;

public class Associer {
	private Date dateDebutContrat;
	private final int idLocataire;
	private Date dateEntree;
	private Date dateSortie;
	private boolean caution;
	private Contrat_Location contratLocation;
	private Locataire locataire;

	public Associer(Date dateDebutContrat, int idLocataire, Date dateEntree, Date dateSortie, boolean caution,
			Contrat_Location contratLocation, Locataire locataire) {
		this.dateDebutContrat = dateDebutContrat;
		this.idLocataire = idLocataire;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
		this.caution = caution;
		this.contratLocation = contratLocation;
		this.locataire = locataire;
	}

	public Date getDateDebutContrat() {
		return dateDebutContrat;
	}

	public int getIdLocataire() {
		return idLocataire;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public boolean isCaution() {
		return caution;
	}

	public Contrat_Location getContratLocation() {
		return contratLocation;
	}

	public Locataire getLocataire() {
		return locataire;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateDebutContrat, idLocataire, dateEntree);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Associer)) {
			return false;
		}
		Associer other = (Associer) obj;
		return Objects.equals(dateDebutContrat, other.dateDebutContrat) &&
				idLocataire == other.idLocataire &&
				Objects.equals(dateEntree, other.dateEntree);
	}

	/**
	 * @param dateDebutContrat the dateDebutContrat to set
	 */
	public void setDateDebutContrat(Date dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}


	/**
	 * @param dateEntree the dateEntree to set
	 */
	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	/**
	 * @param dateSortie the dateSortie to set
	 */
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	/**
	 * @param caution the caution to set
	 */
	public void setCaution(boolean caution) {
		this.caution = caution;
	}

	/**
	 * @param contratLocation the contratLocation to set
	 */
	public void setContratLocation(Contrat_Location contratLocation) {
		this.contratLocation = contratLocation;
	}

	/**
	 * @param locataire the locataire to set
	 */
	public void setLocataire(Locataire locataire) {
		this.locataire = locataire;
	}
}
